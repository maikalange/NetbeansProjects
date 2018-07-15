/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCUS
 */
public class ExamMystery {

    public static void main(String[] args) {
        int[] a = {2, 5, 11, 14, 15, 27, 31};
        boolean m1 = mystery1(a, 5);
        boolean m2 = mystery2(a, 5);
        
        boolean m11 = mystery1(a, 20);
        boolean m21 = mystery2(a, 20);
        //printStars(5);
        //printTriangle(5);
        printTree(10);
    }
    
    private static void printTriangle(int n){
        for (int i = 1; i <= n; i++) {
            printStars(i);
            System.out.println();
        }
        
    }

    private static boolean mystery1(int[] a, int target) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] == target) {
                return true;
            } else if (a[j] > target) {
                return false;
            }
        }
        return false;
    }

    private static boolean mystery2(int[] a, int target) {

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return true;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    private static void printStars(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }

    private static void printTree(int i) {
        for (int j = 1; j <= i; j=j+2) {
            printStars(j);
            System.out.println();
        }
    }

}
