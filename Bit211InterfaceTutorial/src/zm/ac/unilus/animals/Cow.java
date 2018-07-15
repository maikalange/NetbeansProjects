/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.animals;
import zm.ac.unilus.vegetable.Edible;
/**
 *
 * @author MARCUS
 */
public class Cow extends Mammal implements Edible {

    @Override
    public String howToEat() {
        return "Slaughter and roast ";
    }
    
}
