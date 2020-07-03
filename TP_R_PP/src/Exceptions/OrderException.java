/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Alexandre Pires
 */
public class OrderException extends order.exceptions.OrderException {

    /**
     * Creates a new instance of <code>OrderException</code> without detail
     * message.
     */
    public OrderException() {
    }

    /**
     * Constructs an instance of <code>OrderException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public OrderException(String msg) {
        super(msg);
    }
}
