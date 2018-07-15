/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alliancedatastructures;

/**
 *
 * @author MARCUS
 */
public class AllianceDataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialise the array of strings to create an empty
        //array of size 6
        String[] courseCodes = new String[6];
        
        //Populate the array with the data i.e course codes
        courseCodes[0] = "BIT211";
        courseCodes[1] = "BIT221";
        courseCodes[2] = "BIT212";
        courseCodes[3] = "BBA240";
        courseCodes[4] = "BSM250";
        courseCodes[5] = "ED260";
        
        //Display all the elements in the array
        for (int i = 0; i < courseCodes.length; i++) {
            if (courseCodes[i].equals("BIT211")) {
                System.out.println(courseCodes[i] + " Advanced Programming");
            } else if (courseCodes[i].equals("ED260")) {
                System.out.println(courseCodes[i] + " Guidance and couselling");
            } else {
                System.out.println(courseCodes[i]);
            }
        }
        System.out.println("-------------------------");
        //Reverse the display of elements in the array
        String[] reversedCourses = new String[6];
        for (int i = courseCodes.length - 1; i >= 0; i--) {
            System.out.println(courseCodes[i]);
            //Reverse the array
            reversedCourses[i] =  courseCodes[i];
        }

    }

}
