/*
 * Miyambo kasakula
 * BIT1420771
 * ADVANCED PROGRAMMING-ASSIGNMENT
 */
package animalgame;

//import static java.lang.System.out;
import javax.swing.JDialog;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
import zm.ac.unilus.Dog;
import zm.ac.unilus.Lion;
import zm.ac.unilus.Whale;

/**
 *
 * @author mrs k
 */
public class AnimalGame {

    private static String selection = "Dog";
    //private static String showInputDialog;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"Dog", "Whale", "Lion"};
        String initialSelection = (selection);

        @SuppressWarnings("LocalVariableHidesMemberVariable")
        Object selection = JOptionPane.showInputDialog(null, "Welcome to the Animal Farm.Here are some things about mammals! ",
                "Virtual Zoo", JOptionPane.INFORMATION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println("Hi! I am Fluffy the Dog.");
        Dog dog = new Dog();
        dog.cry();
        dog.eat();
        dog.move();
        dog.sleep();

        System.out.println("Hi! I am Sammy the Whale.");
        Whale whale = new Whale();
        whale.cry();
        whale.eat();
        whale.move();
        whale.sleep();

        System.out.println("Hi! I am Leo the Lion.");
        Lion lion = new Lion();
        lion.cry();
        lion.eat();
        lion.move();
        lion.sleep();

        System.out.println(selection);

    }

}
