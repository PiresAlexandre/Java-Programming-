/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packing;

import order.packing.IItem;

/**
 *
 * @author Alexandre Pires
 */
public class Item extends Box implements IItem {

    private String reference;
    private String description;

    public Item(String reference, String description, int depth, int height, int lenght, int volume) {
        super(depth, height, lenght, volume);
        this.reference = reference;
        this.description = description;
    }

    @Override
    public String getReference() {
        return this.reference;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String string) {
        this.description = string;
    }
}
