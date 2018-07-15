/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monicaassignmentprt2;

/**
 *
 * @author monica
 */
public class MonicaAssignmentPrt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        countTo(100);
    }

    private static void countTo(int m) {
        for (int i = 0; i <= m; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("FwizzBizz");
            } else if (i % 5 == 0) {
                System.out.println("Bizz");
            } else if (i % 2 == 0) {
                System.out.println("Fwizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
