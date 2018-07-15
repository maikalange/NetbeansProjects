/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopoddnumbers;

/**
 *
 * @author MARCUS
 */
public class ForLoopOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            } else {
                System.out.println(i * 10);
            }

        }

    }

}
