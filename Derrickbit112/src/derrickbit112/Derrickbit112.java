/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derrickbit112;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Derrickbit112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String highestEducation = "University";
        String highestEducation1 = "No";

        System.out.println("Please enter the applicant age");
        int age = sc.nextInt();

        System.out.println("Please enter the funds available");
        int funds = sc.nextInt();

        System.out.println("Please enter the highest education");
        highestEducation = sc.next();

        System.out.println("Please enter the work experince");
        int work = sc.nextInt();

        if ((age >= 18) && (age <= 25) && (funds >= 5000) && (highestEducation.equals("University")) && (work >= 2) && (work <= 5)) {
            System.out.println("Issue visa and permit");
        } else if ((age >= 26) && (age <= 40) && (funds >= 5000) && (highestEducation.equals("University")) && (work >= 5) && (work <= 10)) {
            System.out.println("Issue visa and permit");
        } else if ((age >= 18) && (age <= 25) && (funds >= 0) && (highestEducation.equals("University")) && (work >= 0) && (work <= 0)) {
            System.out.println("Reject");
        } else if ((age >= 41) && (age <= 60) && (funds >= 5000) && (highestEducation.equals("University")) && (work >= 10)) {
            System.out.println("Issue visa and permit");
        } else if ((age >= 41) && (age <= 60) && (funds >= 5000) && (highestEducation.equals("No")) && (work >= 0)) {
            System.out.println("Refer to Supervisor");
        } else if ((age >= 18) && (age <= 25) && (funds < 5000) && (highestEducation.equals("No")) && (work >= 0)) {
            System.out.println("Reject");
        } else if ((age < 18) && (funds >= 5000) && (work <= 0) && (highestEducation.equals("No")) && (work >= 0)) {
            System.out.println("Refer to Supervisor");
        } else if ((age > 60) && (funds >= 5000) && (work >= 10) && (highestEducation.equals("No")) && (work >= 0)) {
            System.out.println("2 months tourist visa");
        } else {
            System.out.println("Refer to supervisor");
        }
        sc.close();
    }

}
