/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112midsemester2.pkg2016;

/**
 *
 * @author MARCUS
 */
public class Question4ConditionalStatements {

    public void displayDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Day not found");
        }
    }

    public void trafficLightSimulator(String colour) {
        switch (colour) {
            case "RED":
                System.out.println("Stop");
                break;
            case "GREEN":
                System.out.println("Go");
                break;
            case "AMBER":
                System.out.println("Get Ready");
                break;
            default:
                System.out.println("Proceed with caution");
        }
    }

}
