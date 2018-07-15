/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodrepeattutorial;

/**
 *
 * @author MARCUS
 */
public class MethodRepeatTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 4;
        int y = 5;
        int result = add(x + y, y);
        System.out.println(result);

        int answer = add(x + 5, y - 7, 90 - y - x);
        System.out.println(answer);

        int answer2 = add(answer, y - 5, result - y, y * x);
        System.out.println(answer2);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static int add(int a, int j, int k, int i) {
        return a + j + k + i;
    }
}
