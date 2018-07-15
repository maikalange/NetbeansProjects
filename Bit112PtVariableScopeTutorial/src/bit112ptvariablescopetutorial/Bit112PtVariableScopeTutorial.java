/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptvariablescopetutorial;

/**
 *
 * @author MARCUS
 */
public class Bit112PtVariableScopeTutorial {

    //Declare and  initialise the field
    private static final String name = "Rupiah Banda";

    public static void main(String[] args) {
        {
            int result = 4 * 5;
            System.out.println(result);
        }

        //using constants
        int months = TaxCalculator.NUMBER_OF_MONTHS_IN_YEAR;

        System.out.println(months + " months in a year");
        System.out.println(name.toUpperCase());
        printName();
    }

    private static void printName() {
        System.out.println(name);
    }

}
