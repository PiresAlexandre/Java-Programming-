/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packing;

import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;
import order.packing.IPosition;

/**
 *
 * @author Alexandre Pires
 */
public class ItemPacked extends Colored implements IItemPacked {

    private Item item;
    private Position position;

    public ItemPacked(Item item, Position position, Color color, Color colorEdge) {
        super(color, colorEdge);
        this.item = item;
        this.position = position;
    }

    @Override
    public IItem getItem() {
        return this.item;
    }

    @Override
    public IPosition getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(IPosition ip) {
        this.position = (Position) ip;
    }

}
