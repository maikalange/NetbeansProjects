/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211objectserializationtutorial;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 *
 * @author MARCUS
 */
class Person implements Serializable {

    ArrayList<Dog> dogs;
    private final String name;

    public Person(String name, Dog dog) {
        dogs = new ArrayList<>();
        dogs.add(dog);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
