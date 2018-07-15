/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016methodsandstringtutorial;

/**
 *
 * @author MARCUS
 */
public class BIT1122016MethodsAndStringTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String names = "John Wayne,Al Pacino,Marlon Brando,Denzel Washington,Sidney Poitier";
        System.out.println(names.length());
        System.out.println(names.toUpperCase());
        System.out.println(names.toLowerCase());

        printGreeting(names);
        double result = Calculator.add(50, 20);
        System.out.println(result);
    }

    private static void printGreeting(String nameList) {
        String[] actors = nameList.split(",");
        for (int j = actors.length-1; j >=0; j=j-1) {
            System.out.println(" Hello Mr." + actors[j]);
        }

    }

}
