/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniluscollections;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author MARCUS
 */
class Dog {

    private final String NAME;
    private final String COLOR;
    private final long ID;

    public Dog(String name, String color,long id) {
        NAME = name;
        COLOR = color;
        ID = id;

    }
    
    public void wagTail(){
        System.out.println(NAME + " Wagging my tail. So happy it is meal time. My Id is: " + ID);
    }

}
