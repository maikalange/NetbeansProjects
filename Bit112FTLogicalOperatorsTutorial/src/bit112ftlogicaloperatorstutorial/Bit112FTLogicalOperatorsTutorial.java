/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftlogicaloperatorstutorial;

/**
 *
 * @author MARCUS
 */
public class Bit112FTLogicalOperatorsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 19;
        boolean hasNrc = false;
        boolean hasVotersCard = true;
        boolean canVote = isEligilbleVoter(age, hasNrc, hasVotersCard);

        if (canVote) {
            System.out.println("Go to the nearest polling station");
        } else {
            System.out.println("Go to the pub and watch football.");
        }
        int number = 2;
        boolean isMultipleOfFive = checkNumber(number);

        System.out.println(isMultipleOfFive);
    }

    private static boolean isEligilbleVoter(int age, boolean hasNrc, boolean hasVotersCard) {

        return (age >= 18 && hasNrc && hasVotersCard);
    }

    private static boolean checkNumber(int number) {
        return number == 10 || number == 5;
    }

  
}
