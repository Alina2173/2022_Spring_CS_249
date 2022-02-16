package edu.realemj.Exercises_08;
import java.util.*;

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
    }
    
}
