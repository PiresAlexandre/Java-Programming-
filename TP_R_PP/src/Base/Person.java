/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import order.base.IAddress;
import order.base.IPerson;

/**
 *
 * @author Alexandre Pires
 */
public class Person implements IPerson {

    private Address address;
    private String name;

    public Person(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public IAddress getAddress() {
        return this.address;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAddress(IAddress ia) {
        this.address = (Address) ia;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

}
