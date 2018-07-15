/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftwhilelooptutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112FTWhileLoopTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;

        while (i <= 15) {
            
            if (i % 2 == 1) {
                System.out.println(i);
            }
            
            i = i + 1;
        }
    }
}
