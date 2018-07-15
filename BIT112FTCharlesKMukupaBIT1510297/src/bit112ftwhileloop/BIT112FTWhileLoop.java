/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftwhileloop;

/**
 *
 * @author The Kupar
 */
public class BIT112FTWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        for (int i = 0; i <= 20; i++) {
       
            if(i % 2 == 0 && i % 5 == 0) {
                System.out.println("FwizzBizz");
            }else if (i % 2 == 0) {
                System.out.println("Fwizz");
            }else if (i % 5 == 0) {
                System.out.println("Bizz");
             
            }else System.out.println(i);
 
        }
        
        }
    
    }
    



            


    
    
   
