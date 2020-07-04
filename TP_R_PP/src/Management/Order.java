/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import Exceptions.*;
import Base.Customer;
import Base.Person;
import Packing.Item;
import java.time.LocalDate;
import order.base.ICustomer;
import order.base.IPerson;
import order.management.IOrder;
import order.management.IShipping;
import order.packing.IItem;

/*
* Nome: Alexandre Afonso Pires
* Número: 8160299
* Turma: LSIRCT1
 */
public class Order implements IOrder {

    private Person destination;
    private Customer customer;
    private Item items;
    private int id;
    private LocalDate date;
    private Shipping shipping;
    private int numberOfItems;
    private int numberOfRemaingItemsToSend;
    private Item remainingItemsToSend;

    public Order(Person destination, Customer customer, Item items, int id, LocalDate date, Shipping shipping, int numberOfItems, int numberOfRemaingItemsToSend, Item remainingItemsToSend) {
        this.destination = destination;
        this.customer = customer;
        this.items = items;
        this.id = id;
        this.date = date;
        this.shipping = shipping;
        this.numberOfItems = numberOfItems;
        this.numberOfRemaingItemsToSend = numberOfRemaingItemsToSend;
        this.remainingItemsToSend = remainingItemsToSend;
    }

    @Override
    public IPerson getDestination() {
        return this.destination;
    }

    @Override
    public void setDestination(IPerson ip) {
        this.destination = (Person) ip;
    }

    @Override
    public ICustomer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(ICustomer ic) {
        this.customer = (Customer) ic;
    }

    @Override
    public IItem[] getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int i) {
        this.id = i;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setDate(int i, int i1, int i2) {
        LocalDate date = LocalDate.of(i, i1, i2);
    }

    @Override
    public LocalDate getDate() {
        return this.date;
    }

    @Override
    public boolean add(IItem iitem) throws OrderException {
        if (iitem == null) {
            throw new OrderException("The item is null");
        }
        return true;
    }

    @Override
    public IShipping[] getShippings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addShipping(IShipping is) throws OrderException {
        if (is == null || this.isClosed()) {
            throw new OrderException("The order is closed or he shipping is null");
        }
        return true;
    }

    @Override
    public boolean removeShipping(IShipping is) throws OrderException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int clean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate() throws OrderException, ContainerException, PositionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws OrderException, ContainerException, PositionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isClosed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String summary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfRemaingItemsToSend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IItem[] getRemainingItemsToSend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
