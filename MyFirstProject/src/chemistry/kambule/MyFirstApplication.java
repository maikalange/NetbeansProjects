/*
 * This project belongs to TechEdData Services Ltd, Developed by J.A Nyirenda
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemistry.kambule;

/**
 *
 * @author MARCUS
 */
public class MyFirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int answer = 45 + 12;
        int x = 56 - 34;
        int y = 34 * 10;
        double z = 45d / 12;
        int a = 5 % 2;
       
        String name  = "joseph nyirenda";
        String nrc = "456712/11/1";
        String firstPart  = nrc.substring(0, 6);
        
        System.out.println(firstPart);
        System.out.println(name.toUpperCase());

        System.out.println(answer);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        
        System.out.println("Welcome to Kabwe");
    }

}
