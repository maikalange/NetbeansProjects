/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112stringsft;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import sun.security.util.Length;

/**
 *
 * @author MARCUS
 */
public class BIT112StringsFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        capitaliseFullName("Fred", "Flintstone");
        printGreeting("bonjourno");
        reverseName("House on the Hill");
        reverseNameV2("Time On Time");
        assert true : "Assertions are turned on";
    }

    private static void reverseName(String name) {

        char[] array = name.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverse = reverse + array[i];
        }
        System.out.println(reverse);
    }

    private static void getWeekDay() {
        GregorianCalendar c = new GregorianCalendar(1975, 4, 15);
       
    }

    private static void reverseNameV2(String name) {

        StringBuffer s = new StringBuffer(name);
        System.out.println(s.reverse());
    }

    private static void reverseNameV3(String name) {
        StringBuilder s = new StringBuilder(name);
        s.reverse();
    }

    private static void printGreeting(String greeting) {

        System.out.println(greeting);
    }

    private static void capitaliseFullName(String firstName, String lastName) {

        String fullName = firstName + lastName;

        System.out.println(fullName.toUpperCase());
    }

}
