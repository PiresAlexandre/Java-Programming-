/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import order.base.IAddress;

/**
 *
 * @author Alexandre Pires
 */
public class Address implements IAddress {

    private String city;
    private String country;
    private int number;
    private String state;
    private String street;

    public Address(String city, String country, int number, String state, String street) {
        this.city = city;
        this.country = country;
        this.number = number;
        this.state = state;
        this.street = street;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public void setCity(String string) {
        this.city = string;
    }

    @Override
    public void setCountry(String string) {
        this.country = string;
    }

    @Override
    public void setNumber(int i) {
        this.number = i;
    }

    @Override
    public void setState(String string) {
        this.state = string;
    }

    @Override
    public void setStreet(String string) {
        this.street = string;
    }

}
