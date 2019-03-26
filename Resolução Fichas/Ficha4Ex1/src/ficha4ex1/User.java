/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1;

/**
 *
 * @author pires
 */

public class User {
    
    private static final int ID_SIZE = 3;
    private static char[] id = new char[ID_SIZE];
    private static char[] name;
    private static char[] email;
    private static Expenses despesas;

    public User(char[] id, char[] name, char[] email, Expenses despesas) {
        User.id = id;
        User.name = name;
        User.email = email;
        User.despesas = despesas;
    }

    public static char[] getId() {
        return id;
    }

    public static char[] getName() {
        return name;
    }

    public static char[] getEmail() {
        return email;
    }
}
