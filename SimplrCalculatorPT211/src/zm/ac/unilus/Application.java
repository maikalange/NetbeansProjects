/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author MARCUS
 */
public class Application {

    public static void main(String[] args) {
        String color = "red";
        
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "amber":
                System.out.println("Get ready");
                break;
            default:
                System.out.println("Proceed with caution");
        }
    }

}
