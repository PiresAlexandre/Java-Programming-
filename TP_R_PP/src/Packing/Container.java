/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packing;

import Exceptions.*;
import order.packing.*;
import Packing.*;

/*
* Nome: Alexandre Afonso Pires
* Número: 8160299
* Turma: LSIRCT1
 */

public class Container extends Box implements IContainer {

    private static final int DEFAULT_SIZE = 20; //Numero a sorte
    private int occupiedVolume;
    private ItemPacked[] packedItems;
    private String reference;
    private boolean isClosed;
    private Color color;
    private Color colorEdge;

    public Container(int occupiedVolume, ItemPacked[] packedItems, String reference, boolean isClosed, Color color, Color colorEdge, int depth, int height, int lenght, int volume) {
        super(depth, height, lenght, volume);
        this.occupiedVolume = 0;
        this.packedItems = new ItemPacked[DEFAULT_SIZE];
        this.reference = reference;
        this.isClosed = false;
        this.color = color;
        this.colorEdge = colorEdge;

    }

    @Override
    public boolean addItem(IItem iitem, IPosition ip, Color color) throws ContainerException {
        //Exceções 
        if (iitem == null && ip == null && color == null) {
            throw new ContainerException("Color, item and position are null");
        }
        if (this.isClosed) {
            throw new ContainerException("The container is closed");
        }
        //Retorna falso se o item ja existir no container
        if (findItemPacked((Item) iitem) != -1) {
            return false;
        }
        
        ItemPacked packed = new ItemPacked((Item)iitem,(Position) ip, color, color);
        ItemPacked[] array = new ItemPacked[this.packedItems.length + 1];
        for (int i = 0; i < this.packedItems.length; i++) {
            array[i] = this.packedItems[i];
        }
        array[this.packedItems.length] = packed;
        this.packedItems = array;
        this.occupiedVolume += packed.getItem().getVolume();
        return true;
    }

    @Override
    public boolean removeItem(IItem iitem) throws ContainerException {
        //Exceções 
        if (iitem == null || this.isClosed) {
            throw new ContainerException("The parameter is null or the container is closed");
        }
        //Retorna falso se o item nao existe no container 
        int pos = findItemPacked((Item) iitem);
        if (pos == -1) {
            return false;
        }
        
        this.packedItems[pos] = null;
        ItemPacked[] array = new ItemPacked[this.packedItems.length - 1];
        for (int i = pos; i < (this.packedItems.length - 1); i++) {
            this.packedItems[i] = this.packedItems[i + 1];
        }
        for (int i = 0; i < (this.packedItems.length - 1); i++) {
            array[i] = this.packedItems[i];
        }
        this.occupiedVolume -= iitem.getVolume();
        this.packedItems = array;

        return true;
    }

    @Override
    public void validate() throws ContainerException, PositionException {
        if (this.occupiedVolume > super.getVolume()) {
            throw new ContainerException("Volume greater than the current volume") {
            };
        }
        for (ItemPacked item : this.packedItems) {
            if ((item.getItem().getLenght() + item.getPosition().getX()) > super.getLenght()
                    && item.getItem().getDepth() + item.getPosition().getY() > super.getDepth()
                    && item.getItem().getHeight() + item.getPosition().getZ() > super.getHeight()) {
                throw new PositionException("Item is outside the container") {
                };
            }
        }
        for (ItemPacked item : this.packedItems) {
            int xsum = item.getPosition().getX() + item.getItem().getLenght();
            int ysum = item.getPosition().getY() + item.getItem().getDepth();
            int zsum = item.getPosition().getZ() + item.getItem().getHeight();

            for (ItemPacked item2 : this.packedItems) {
                if (!item.equals(item2)) {
                    int x2sum = item2.getPosition().getX() + item2.getItem().getLenght();
                    int y2sum = item2.getPosition().getY() + item2.getItem().getDepth();
                    int z2sum = item2.getPosition().getZ() + item2.getItem().getHeight();

                    if ((x2sum > item.getPosition().getX() && item2.getPosition().getX() < xsum)
                            || (y2sum > item.getPosition().getY() && item2.getPosition().getY() < ysum)
                            || (z2sum > item.getPosition().getZ() && item2.getPosition().getZ() < zsum)) {
                        throw new PositionException("Item is overlapping other item") {
                        };
                    }
                }
            }
        }
    }

    @Override
    public void close() throws ContainerException, PositionException {
        this.validate();
        this.isClosed = true;
    }

    @Override
    public IItem getItem(String string) {
        for (IItemPacked item : this.packedItems) {
            if (item.getItem().getReference().equals(string)) {
                return item.getItem();
            }
        }
        return null;
    }

    @Override
    public int getOccupiedVolume() {
        return this.occupiedVolume;
    }

    @Override
    public IItemPacked[] getPackedItems() {
        return this.packedItems;
    }

    @Override
    public String getReference() {
        return this.reference;
    }

    @Override
    public int getNumberOfItems() {
        return this.packedItems.length;
    }

    @Override

    //Vai buscar o volume da box e subtrai o volume ocupado para determinar o volume que sobra 
    public int getRemainingVolume() {
        return (super.getVolume() - this.occupiedVolume);
    }

    @Override
    public boolean isClosed() {
        return this.isClosed;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Color getColorEdge() {
        return this.colorEdge;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setColorEdge(Color color) {
        this.colorEdge = color;
    }

    public int findItemPacked(Item item) {
        for (int i = 0; i < this.packedItems.length; i++) {
            if (this.packedItems[i].getItem().equals(item)) {
                return i;
            }
        }
        return -1;
    }

}
