/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211modelviewcontrollertutorial;

import java.util.Vector;

/**
 *
 * @author MARCUS
 */
public class Model {

    private final Vector<String> items;
    
    public Model(){
        items = new Vector<>();
    }
    
    public Vector<String> getItemList(){
        return items;
    }
    
    void addItem(String item) {
        items.add(item);
    }
    
}
