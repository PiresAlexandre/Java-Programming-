/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import order.base.ICustomer;
import order.exceptions.OrderException;
import order.management.IManagement;
import order.management.IOrder;

/*
* Nome: Alexandre Afonso Pires
* Número: 8160299
* Turma: LSIRCT1
 */
public class Management implements IManagement {

    @Override
    public boolean add(IOrder iorder) throws OrderException {
        if (iorder == null) {
            throw new Exceptions.OrderException("The order is null");
        }
        return true;
    }

    @Override
    public boolean remove(IOrder iorder) throws OrderException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IOrder[] getOrders(ICustomer ic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IOrder[] getOrders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
