/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialstringtutorial;

import static java.lang.System.out;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialStringTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nrc = "495944/11/1";
       String userName = "Rupiah Banda";
       
       //Simple string joining or concatenation using a +
       out.println(nrc + userName);
       
       out.println(userName.toUpperCase());
       out.println(userName.toLowerCase());
       //use substring to get part of a string starting at a specified index
       String firstPartNrc  = nrc.substring(0, 6);
       out.println(firstPartNrc);
       
       String tazamaTransaction = "ABH9038,Volvo,12000,Total Zambia";
       String[] report = tazamaTransaction.split(",");
       
       //This is an enhanced for loop
       for(String r:report){
           out.println(r.toUpperCase());
       }
    }
}
