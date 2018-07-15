/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.community.domain;

import java.util.Objects;

/**
 *
 * @author MARCUS
 */
public class Topic {

    private final String name;

    public Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Topic) {
            if (((Topic) o).getName().equalsIgnoreCase(this.name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
