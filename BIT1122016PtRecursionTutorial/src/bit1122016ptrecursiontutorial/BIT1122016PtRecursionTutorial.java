/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016ptrecursiontutorial;

/**
 *
 * @author MARCUS
 */
public class BIT1122016PtRecursionTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        countDown(200);
    }

    private static void countDown(int j) {
        if (j != 0) {
            System.out.println(j);
            countDown(j - 1);
        }
    }
}
1 public class SimpleGeometricObject {
2 private String color = "white";
3 private boolean filled;
4 private java.util.Date dateCreated;
5
6 /** Construct a default geometric object */
7 public SimpleGeometricObject() {
8 dateCreated = new java.util.Date();
9 }