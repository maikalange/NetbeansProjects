/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211shadowingtutorial;

/**
 *
 * @author MARCUS
 */
public class Bit211ShadowingTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator myCalc = new Calculator(23,89);
        double answer  = myCalc.add();
        System.out.println(answer);
        
        Calculator calc2 = new Calculator(12,8);
        System.out.println(calc2.add(100));
        
        //Create 100 calculator instances and call/invoke the add method
        for (int i = 0; i < 100; i++) {
            double x= 50* Math.random();
            double y =80* Math.random();
            Calculator c  = new Calculator(x,y);
            System.out.println(c.add());
        }
        
        Mammal myCow  = new Cow();
        myCow.eat();
        myCow.move();
        myCow.sleep();
        

        
        Mammal myDog  = new Dog("Poppy");
        myDog.move();
        myDog.sleep();
        myDog.eat();
        System.out.println(myDog);
        
    }
    
}
