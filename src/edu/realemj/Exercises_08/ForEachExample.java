package edu.realemj.Exercises_08;
import java.util.*;
import edu.realemj.Exercises_01.*;

public class ForEachExample {
    public static void main(String [] args) {
        String [] names = {
            "Bob", "Joe", "Mary", "Sue"
        };

        for(String s: names) {
            System.out.println(s);
            s = "Hello";
        }

        System.out.println(Arrays.toString(names));

        Person [] people = new Person[3];
        people[0] = new Person("Bob", 23);
        people[1] = new Person("Methuselah", 900);
        people[2] = new Person("Fitzwilliam", 38);

        for(Person p: people) {
            // DOES STICK
            p.setAge(25);

            // Doesn't stick
            p = new Person("Joe", 43);
            System.out.println(p);
        }

        System.out.println("PEOPLE:");
        for(Person q: people) {
            System.out.println(q);
        }

    }
    
}
