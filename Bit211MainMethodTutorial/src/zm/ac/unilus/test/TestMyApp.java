/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.test;

import java.util.HashSet;
import java.util.Set;
import zm.ac.unilus.apps.MyApp;

/**
 *
 * @author MARCUS
 */
public class TestMyApp {

    public static void main(String[] args) {
        String[] args2 = {"12+3", "15-8"};
        
        HashSet<Topic> topics = new HashSet();
        
        MyApp.main(args2);
        zm.ac.unilus.apps.Foo myFoo = new zm.ac.unilus.apps.Foo();
        zm.ac.unilus.utilities.Foo myOtherFoo = new zm.ac.unilus.utilities.Foo();
    }

}
