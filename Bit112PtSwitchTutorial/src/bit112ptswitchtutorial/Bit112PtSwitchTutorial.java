/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptswitchtutorial;

/**
 *
 * @author MARCUS
 */
public class Bit112PtSwitchTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getMonthName(3);
        short month1 = 2;
        getMonthName(month1);
        
    }

    private static void getMonthName(short month) {
        
        //call another method
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Unable to get the month");
        }
    }

    private static void getMonthName(int month1) {
        if (month1 == 1) {
            System.out.println("January");
        } else if (month1 == 2) {
            System.out.println("February");
        } else {
            System.out.println("Unable to get the month");
        }
    }


}
