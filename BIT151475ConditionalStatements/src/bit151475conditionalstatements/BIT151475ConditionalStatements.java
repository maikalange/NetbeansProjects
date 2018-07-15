/*
 * Developed by GRZ for MInistry of Finance
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit151475conditionalstatements;

/**
 *
 * @author MARCUS
 */
public class BIT151475ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color="red";
        String gender="female";
        if (color=="red") {
            System.out.println("Stop!");
            if (gender=="male") {
                 System.out.println("Buy newspaper");
            }else{
                System.out.println("Buy talk time");
            
            }
        }
        else if (color=="green") {
            System.out.println("Go!");
            //more green related code can come here
        }
        else if (color=="amber") {
            System.out.println("Get ready");
        }
        else{
            System.out.println("Lights not working. proceed with caution");
        }
    }
}
