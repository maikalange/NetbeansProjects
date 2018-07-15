/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcbatch3conditionalstatements;

/**
 *
 * @author MARCUS
 */
public class CDCBatch3ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean hasFitness = false;
        boolean hasRoadTax = false;
        boolean hasSafety = false;
        boolean hasLicence = false;
        boolean hasInsurance = false;

        int fine1 = 100;
        int fine2 = 200;
        int fine3 = 300;
        int fine4 = 400;

        if (hasFitness && !hasLicence && !hasSafety && !hasRoadTax) {
            System.out.println("Pay ZMW  " + fine3);
        } else if (!hasFitness && !hasInsurance && !hasRoadTax && !hasSafety) {
            System.out.println("Pay ZMW  " + fine4);
        }

        if (hasLicence && hasRoadTax && hasSafety && hasFitness && hasInsurance) {
            System.out.println("Good bye have a good day. Safe journey");
        } else {
            System.out.println("Pay a penatly to the officer");
        }

        if (hasInsurance || hasSafety) {
            System.out.println("Consider a reduced fine");
        }

    }

}
