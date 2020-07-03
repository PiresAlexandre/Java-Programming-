/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import Packing.Container;
import Exceptions.*;
import order.management.IShipping;
import order.management.ShipmentStatus;
import order.packing.IContainer;

/*
* Nome: Alexandre Afonso Pires
* Número: 8160299
* Turma: LSIRCT1
 */
public class Shipping implements IShipping {

    private ShipmentStatus shipmentStatus;
    private Container[] containers;
    private double cost;

    @Override
    public boolean addContainer(IContainer ic) throws OrderException, ContainerException {
        if (ic == null || !ic.isClosed()) {
            throw new ContainerException("Any parameter is null or closed");
        }
        if (!this.shipmentStatus.equals(ShipmentStatus.IN_TREATMENT)) {
            throw new OrderException("OrderStatus is not equal to IN_TREATMENT");
        }
        if (existsContainer(ic)) {
            return false;
        }
        //Passa o array anterior para um novo array com maior tamanho
        Container[] array = new Container[this.containers.length + 1];
        for (int i = 0; i < containers.length; i++) {
            array[i] = this.containers[i];
        }
        //Adiciona na ultima posição do array
        array[this.containers.length] = (Container) ic;
        this.containers = array;
        return true;
    }

    @Override
    public boolean removeContainer(IContainer ic) throws OrderException, ContainerException {
        if (ic == null) {
            throw new ContainerException("Parameter is null");
        }
        if (!this.shipmentStatus.equals(ShipmentStatus.IN_TREATMENT)) {
            throw new OrderException("The status is nor in_treatment");
        }
        //Buscar a posicao do container a remover
        int pos = findContainerPosition(ic.getReference());
        if (pos == -1) {
            return false;
        }
        //Posicao do container removido fica null
        this.containers[pos] = null;
        //Cria um array com menor tamanho
        Container[] array = new Container[this.containers.length - 1];
        //Puxa o array para que não haja posiçoes intermedias a null
        for (int i = pos; i < (this.containers.length - 1); i++) {
            this.containers[i] = this.containers[i + 1];
        }
        //Passa o array containers para o novo array 
        for (int i = 0; i < (this.containers.length - 1); i++) {
            array[i] = this.containers[i];
        }
        //Iguala ao novo array 
        this.containers = array;
        return true;
    }

    @Override
    public boolean existsContainer(IContainer ic) {
        if (findContainer(ic.getReference()) != null) {
            return true;
        }
        return false;
    }

    //Retorna o container 
    @Override
    public IContainer findContainer(String string) {
        return this.containers[findContainerPosition(string)];
    }

    public int findContainerPosition(String string) {
        for (int i = 0; i < this.containers.length; i++) {
            if (this.containers[i].getReference().equals(string)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ShipmentStatus getShipmentStatus() {
        return this.shipmentStatus;
    }

    @Override
    public void setShipmentStatus(ShipmentStatus ss) throws OrderException, ContainerException, PositionException {
        if (ss.equals(shipmentStatus.IN_TREATMENT) && !this.shipmentStatus.equals(ShipmentStatus.AWAITS_TREATMENT)) {
            throw new OrderException("Invalid Order");
        }
        if (ss.equals(shipmentStatus.CLOSED) && !this.shipmentStatus.equals(ShipmentStatus.IN_TREATMENT) || this.containers.length <= 0) {
            throw new ContainerException("Invalid Container");
        }
        if (ss.equals(shipmentStatus.SHIPPED) && !this.shipmentStatus.equals(ShipmentStatus.CLOSED)) {
            throw new PositionException("Invalid Position");
        }
        validate();
        this.shipmentStatus = ss;

    }

    @Override
    public IContainer[] getContainers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate() throws ContainerException, PositionException {
        for (Container container : this.containers) {
            container.validate();
        }
    }

    @Override
    public String summary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}