/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ootutorialpt2;

/**
 *
 * @author MARCUS
 */
public class Bit211OOTutorialPt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        //Step1 instantiate the Square class to create a square instance
        Polygon sq = new Square(10.35, 4);

        //Invoke the methods to calculate area and perimeter
        double area = sq.getArea();
        double perimeter = sq.getPerimeter();
        double x = sq.getNumberOfSides();

        //Display the area and perimeter
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(x);
        System.out.println("-------------------------------------------");
        //Call the mutator method to change the value of sideA
        sq.setSideA(22.5);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        
        Square sq3 = new Square(10.8, 4);
        Square sq2 = new Square(7, 4);
        //Compare sq3 and sq2
        boolean areEqual = sq3.equals(sq2);
        System.out.println(areEqual);
        Square sq4 = (Square) sq2.clone();
        
        System.out.println(sq4.equals(sq2));
        
        System.out.println("banking stuff-------------------------------------------");
        Account savings = new SavingsAccount(123123123123L, "John");
        Account current = new CurrentAccount(134534545L, "Peter");
        current.deposit(200);
        System.out.println(current.checkBalance());
        current.withDraw(300);
        System.out.println(current.checkBalance());
        
        Circle stadium = new Circle(34);
        double a = stadium.getArea();
        double p = stadium.getPerimeter();
        stadium.setRadius(50);
        stadium.getArea();
        stadium.getPerimeter();
        
        System.out.println(MySearchEngines.YAHOO_URL);
        int numberOfLinks = MySearchEngines.getNumberOfUrls();
        
        System.out.println(numberOfLinks);
        
        for (int i = 1; i <= 30; i++) {
            System.out.println("Circle number " + i);
            double radius = Math.random() * 50;
            Circle c = new Circle(radius);
            System.out.println(c.getArea());
            System.out.println(c.getPerimeter());
            System.out.println("---------------------------------------");
        }
       int number =  Circle.getNumberOfCirclesCreated();
       System.out.println(number);
    }
    
}
