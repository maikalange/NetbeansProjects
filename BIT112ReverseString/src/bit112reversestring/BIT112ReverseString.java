/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112reversestring;

/**
 *
 * @author MARCUS
 */
public class BIT112ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean result = isPalindrome("madame");
        System.out.println(result);
    }

    public static boolean isPalindrome(String words) {
        char[] letters = words.toCharArray();

        String reverse = "";
        boolean palindrome = false;
        for (int i = letters.length - 1; i >= 0; i--) {
            reverse = reverse + letters[i];
        }

        if (reverse.equals(words)) {
            System.out.println("Is Palindrome");
            palindrome = true;
        }
        System.out.println(reverse);

        return palindrome;
    }

}
