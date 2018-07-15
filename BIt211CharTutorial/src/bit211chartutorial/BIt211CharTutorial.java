/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211chartutorial;


/**
 *
 * @author MARCUS
 */
public class BIt211CharTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Character c = '5';
        
        if (Character.isDigit(5)) {
            System.out.printf("%d2", 123);
        }
        String format = String.format("K%,.2f\n", 1426567342.05289/31225.2);
        
        System.out.println(format);
        
        String nrc = "593977/11/1";
        String[] nrcSplit = nrc.split("/");
        
        for (int i = 0; i < nrcSplit.length; i++) {
            System.out.println(nrcSplit[i]);
            break;
        }
        
        for (String nrcSplit1 : nrcSplit) {
            System.out.println(nrcSplit1);
            break;
        }
        System.out.println("---------------------------------------------");
        String nrcFragment = nrc.substring(0, 6);
        System.out.println(nrcFragment);


        
        String passportNumber = "ZG20437";
        String[] split = passportNumber.split("ZG");

        for (String split1 : split) {
            System.out.println(split1);
        }

        String number = ".45";
        double value;
        if (number.startsWith(".")) {
            value = Double.parseDouble(new StringBuilder(number).insert(0, '0').toString());
            System.out.println(value / 100);
        }

    }

}
