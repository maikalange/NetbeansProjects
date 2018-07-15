/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacalculator;

/**
 *
 * @author Home
 */
// CLASS TO CALCULATE THE CONTINUOUS ASSESMENT OF STUDENT
import java.util.Scanner;

public class cacalculator {

    public static void main(String[] args) {
        int intw = 0;
        int intx = 0;
        int inty = 0;
        int intz = 0;
        int scorew = 0;
        int scorex = 0;
        int scorey = 0;
        int scorez = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Please enter the valid assignment score between 0 and 10");
            intw = in.nextInt();
            scorew = intw;
        } while (intw < 0 || intw > 10);
        System.out.println("Please enter test results:");

        intx = in.nextInt();
        if (intx >= 0 && intx <= 10) {
            scorex = intx;

        } else {
            System.out.println("Invalid! Please enter valid test results:");
        }

        System.out.println("Please enter mid semester exam results:");

        inty = in.nextInt();
        if (inty >= 0 && inty <= 20) {
            scorey = inty;

        } else {
            System.out.println("Invalid! Please enter valid mid semester exam results");
        }

        System.out.println("Please enter final exam results:");

        intz = in.nextInt();
        if (intz >= 0 && intz <= 60) {
            scorez = intz;

        } else {
            System.out.println("Invalid! Please enter valid final exam results:");
        }

        /*scorey = SimpleCalculator.div(scorey, 100);
         scorez = (scorez/100)*60;
         scorex = (scorex/100)*10;
         scorew = (scorew / 100) * 10;*/
        sum = scorew + scorex + scorey + scorez;

        System.out.println("Your current CA is " + sum);

       in.close();
    }

}
