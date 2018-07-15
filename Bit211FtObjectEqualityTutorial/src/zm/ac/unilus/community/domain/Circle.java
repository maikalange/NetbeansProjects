/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.community.domain;

/**
 *
 * @author MARCUS
 */
public class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius  = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    @Override
    public boolean equals(Object o){
        if (o!=null&& o instanceof Circle) {
            return ((Circle)o).radius==radius;
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        return hash;
    }
}
