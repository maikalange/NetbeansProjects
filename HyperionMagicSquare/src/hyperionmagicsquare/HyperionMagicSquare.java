package hyperionmagicsquare;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class HyperionMagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an odd number for the size of the magic square");
        int n = myScanner.nextInt();
        if (n % 2 == 0) {
            throw new IllegalArgumentException("An odd number was expected. You entered an even number");
        }

//declare a 2 dimensional array nxn to represent the magic square
        int[][] magicSquare = new int[n][n];
//locate where to place the first element(1)
        int row = n - 1;
        int col = n / 2;
        int maxNumber = n * n;
        magicSquare[row][col] = 1;
        for (int i = 2; i <= maxNumber; i++) {
            if (magicSquare[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                row = (row - 1 + n) % n;
            }
            magicSquare[row][col] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magicSquare[i][j] < 10) {
                    System.out.print(" ");
                }
                if (magicSquare[i][j] < 100) {
                    System.out.print(" ");
                }
                System.out.print(magicSquare[i][j] + " ");

            }
            System.out.println();
        }
    }
}
