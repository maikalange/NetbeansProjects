/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressions;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author MARCUS
 */
public class LambdaExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Predicate<Integer> isUnderAge = (Integer age) -> {
            return age > 15;
        };
        Function<Person, String> doGetFullName = (Person k) -> {
            System.out.println(k.getName().toUpperCase());
            return k.getName().toUpperCase();
        };
        Person john = new Person(12, "John Brown");
        Person tom = new Person(13, "Adam Smith");
        Person james = new Person(22, "James Martin");

        Person steve = new Person(32, "Steve Johnes");
        Person fred = new Person(42, "Fred Martin");
        Person andreas = new Person(52, "Andreas Martin");
        Person melvin = new Person(36, "Melvin Smith Martin");

        Person[] people = {john, tom, steve, james, fred, melvin, andreas};

        Long numberOfPeople = Stream.of(people).count();
        Predicate<Person> isOlderThan20 = (Person k) -> {
            return k.getAge() > 20;
        };

        long count = Stream.of(people).filter(isOlderThan20).count();
        System.out.println(count + " are older than 20");

        Stream.of(people).forEach(person -> processName(doGetFullName, person));
        Stream<Person> persons = Stream.of(people).sorted();

        persons.forEach(person -> System.out.println(person.getName()));

        Comparator<Person> myComparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge()>o2.getAge()) {
                    return 1;
                }else if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        };
        Optional<Person> youngest  = Stream.of(people).min(myComparator);
        Optional<Person> oldest  = Stream.of(people).max(myComparator);
        
        String myName = processName(doGetFullName, john);

        Consumer<String> printGreeting = (String title) -> {
            System.out.println(title + "   " + myName);
        };

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> {
            System.out.println(x);
            System.out.println(y);
            return x + y;
        };
        BinaryOperator<Integer> add = (Integer x, Integer y) -> {
            System.out.println(x);
            System.out.println(y);
            return 2 * x + y;
        };

        System.out.println(addSomeStuff(addExplicit));

        Integer answer = performCalculation(add, 12, 15);
        System.out.println(answer);

        BinaryOperator<Integer> subtract = (Integer x, Integer y) -> {
            return x - y;
        };

        BinaryOperator<Double> divide = (Double x, Double y) -> {
            if (y == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return x / y;
        };
        try {
            Double doDivide = divideSome(divide, 2.0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        printMessage(printGreeting, "Mr");
    }

    public static Long addSomeStuff(BinaryOperator<Long> f) {
        return f.apply(120L, 30L);

    }

    private static void printMessage(Consumer c, String name) {
        c.accept(name);
    }

    private static Integer performCalculation(BinaryOperator<Integer> x, Integer z, Integer k) {
        return x.apply(z, k);
    }

    private static Double divideSome(BinaryOperator<Double> f, double d, double d0) {
        return f.apply(d, d0);
    }

    private static String processName(Function<Person, String> doGetFullName, Person person) {
        return doGetFullName.apply(person);
    }
}
