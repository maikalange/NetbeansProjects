/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author MARCUS
 */
public class Person {
    String name;
    int age;
    double height;
    char gender;
    String nrc;
    
    public String getNrc(){
        return this.nrc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getFullDetails() {
        String details = "I am " + this.name + " and my NRC is" + this.nrc + " and I am " + this.height + " m tall";

        return details;
    }

}
