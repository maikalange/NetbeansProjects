/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alliancemethodstutorial15092015;

/**
 *
 * @author MARCUS
 */
public class AllianceMethodsTutorial15092015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int answer = SimpleCalculator.add(10, 4);
        System.out.println(answer);

        int answer2 = SimpleCalculator.multiply(10, 25);
        System.out.println(answer2);

        int answer3 = SimpleCalculator.multiply(22, 36);
        System.out.println(answer3);

        SimpleCalculator.printGreeting("Muli buti asiha");
        SimpleCalculator.printGreeting("Namaste");
        SimpleCalculator.printGreeting("Ni hao ma");

        String result = SimpleCalculator.reverseName("Banda");//calling the method and assigning to result
        System.out.println(result);//prints out my reversed string
    }
    

    
    



}
