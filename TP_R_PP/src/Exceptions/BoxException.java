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
public class BoxException extends order.exceptions.BoxException {

    /**
     * Creates a new instance of <code>BoxException</code> without detail
     * message.
     */
    public BoxException() {
    }

    /**
     * Constructs an instance of <code>BoxException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BoxException(String msg) {
        super(msg);
    }
}
