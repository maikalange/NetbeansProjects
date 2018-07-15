/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingconversion;

/**
 *
 * @author MARCUS
 */
public class CastingConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int is 32 bit; long is 64bit integer
        int number = (int) Math.pow(2, 31);

        long x = number;
        System.out.println(x);
        System.out.println(number);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }

    abstract class Caravan {

        private double price;
        private  String model;
        private String year;

        public abstract void goFast(); //an abstract method

        public abstract void changeColor();
        
        public void setPrice(){
            price = 10;
        }
        
        public double getPrice(){
            return price;
        }
        
        public Caravan(double price,String model){
            this.model = model;
            this.price = price;
        }
    }
    


}
