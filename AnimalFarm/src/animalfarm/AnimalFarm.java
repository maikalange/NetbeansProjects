/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalfarm;

import zm.ac.unilus.BatMammal;
import zm.ac.unilus.DogMammal;
import zm.ac.unilus.GoatMammal;
import zm.ac.unilus.WhaleMammal;

/**
 *
 * @author SIAFWA FAMILY
 */
public class AnimalFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GoatMammal gm = new GoatMammal();
        gm.cry();
        gm.move();
        gm.eat();
        gm.sleep();
        System.out.println("-------------------------------------------------------");
        DogMammal dm = new DogMammal();
        dm.cry();
        dm.move();
        dm.eat();
        dm.sleep();
        System.out.println("-------------------------------------------------------");
        WhaleMammal wm = new WhaleMammal();
        wm.cry();
        wm.eat();
        wm.move();
        wm.sleep();
        System.out.println("-------------------------------------------------------");
        BatMammal bm = new BatMammal();
        bm.cry();
        bm.eat();
        bm.move();
        bm.sleep();

    }

}
