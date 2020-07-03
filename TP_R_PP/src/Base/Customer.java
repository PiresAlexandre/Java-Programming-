/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import order.base.IAddress;
import order.base.ICustomer;

/**
 *
 * @author Alexandre Pires
 */
public class Customer extends Person implements ICustomer {

    private int customerId;
    private String vat;
    private Address billingAddress;

    public Customer(int customerId, String vat, Address billingAddress, Address address, String name) {
        super(address, name);
        this.customerId = customerId;
        this.vat = vat;
        this.billingAddress = billingAddress;
    }

    @Override
    public int getCustomerId() {
        return this.customerId;
    }

    @Override
    public String getVat() {
        return this.vat;
    }

    @Override
    public void setVat(String string) {
        this.vat = string;
    }

    @Override
    public IAddress getBillingAddress() {
        return this.billingAddress;
    }

    @Override
    public void setBillingAddress(IAddress ia) {
        this.billingAddress = (Address) ia;
    }

}
