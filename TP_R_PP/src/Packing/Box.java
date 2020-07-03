/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packing;

import order.packing.IBox;

/**
 *
 * @author Alexandre Pires
 */
public class Box implements IBox {

    private int depth;
    private int height;
    private int lenght;
    private int volume;

    public Box(int depth, int height, int lenght, int volume) {
        this.depth = depth;
        this.height = height;
        this.lenght = lenght;
        this.volume = volume;
    }

    @Override
    public int getDepth() {
        return this.depth;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getLenght() {
        return this.lenght;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

}
