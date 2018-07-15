/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016methodsandstringtutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class ConsoleApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        double number = sc.nextDouble();
        
        System.out.println("Please enter another number");
        double number2 = sc.nextDouble();
        
        Calculator calc = new Calculator(number, number2);
        calc.add(4,5);
        System.out.println(calc.add());
        sc.close();
    }
}
