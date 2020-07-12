/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.util.Objects;
import order.base.IAddress;
import order.base.ICustomer;

/**
 *
 * @author Alexandre Pires
 */
public class Customer extends Person implements ICustomer {

    private static int nextId=0;
    private final int customerId;
    private String vat;
    private Address billingAddress;

    public Customer(int customerId, String vat, Address billingAddress, 
            Address address, String name) {
        super(address, name);
        this.customerId = nextId++;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.customerId != other.customerId) {
            return false;
        }
        if (!Objects.equals(this.vat, other.vat)) {
            return false;
        }
        if (!Objects.equals(this.billingAddress, other.billingAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", vat=" + vat + 
                ", billingAddress=" + billingAddress + '}';
    }
}
