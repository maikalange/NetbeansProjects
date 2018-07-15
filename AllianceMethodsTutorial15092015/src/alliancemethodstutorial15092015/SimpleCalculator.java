package alliancemethodstutorial15092015;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCUS
 */
public class SimpleCalculator {

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static String reverseName(String name) {

        StringBuilder sb = new StringBuilder(name);//helper object to reverse string for me

        return sb.reverse().toString();

    }

    public static int multiply(int x, int y) {

        int result = x * y;
        return result;
    }

    public static void printGreeting(String greeting) {
        System.out.println(greeting);

    }

}
