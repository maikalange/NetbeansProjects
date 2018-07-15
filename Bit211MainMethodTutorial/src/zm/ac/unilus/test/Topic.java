/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.test;

import java.util.ArrayList;

/**
 *
 * @author MARCUS
 */
public class Topic {
    private final ArrayList<Message> messages;
    private final String name;
    
    public Topic(String name){
        this.name  = name;
        messages = new ArrayList<>();
    }
    
    public void addMessage(Message message){
        messages.add(message);
    }
    
    public void displayMessages(){
        for(Message m:messages){
            System.out.println(m);
        }
    }
}
