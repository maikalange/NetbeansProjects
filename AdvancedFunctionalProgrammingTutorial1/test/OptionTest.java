/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.lusakafreeads.None;
import com.lusakafreeads.Option;
import com.lusakafreeads.Some;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS
 */
public class OptionTest {

    private List<Option<String>> names = null;

    @Before
    public void setup() {
        names = new ArrayList<>();
        names.add(new Some<>("Dean"));
        names.add(new None<String>());
        names.add(new Some<>("Wampler"));
    }

    @Test
    public void getOrElseUsesValueForSomeAndAlternativeForNone() {
        String[] expected = {"Dean", "Unknown!", "Wampler"};
        System.out.println("*** Using getOrElse:");
        for (int i = 0; i < names.size(); i++) {
            Option<String> name = names.get(i);
            String value = name.getOrElse("Unknown!");
            System.out.println(name + ": " + value);
            assertEquals(expected[i], value);
        }
    }

    @Test
    public void hasNextWithGetUsesOnlyValuesForSomes() {
        String[] expected = {"Dean", null, "Wampler"};;
        System.out.println("*** Using hasValue:");
        for (int i = 0; i < names.size(); i++) {
            Option<String> name = names.get(i);
            if (name.hasValue()) {
                String value = name.get();
                System.out.println(name + ": " + value);
                assertEquals(expected[i], value);
            }
        }
    }

    static Option<String> wrap(String s) {
        if (s == null) {
            return new None<String>();
        } else {
            return new Some<String>(s);
        }
    }

    @Test
    public void exampleMethodReturningOption() {
        System.out.println("*** Method that Returns an Option:");
        Option<String> opt1 = wrap("hello!");
        System.out.println("hello! -> " + opt1);
        assertEquals(Some.class, opt1.getClass());
        assertEquals("hello!", opt1.get());
        Option<String> opt2 = wrap(null);
        System.out.println("null -> " + opt2);
        assertEquals(None.class, opt2.getClass());
    }
}
