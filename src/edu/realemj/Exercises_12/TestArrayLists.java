package edu.realemj.Exercises_12;
import java.util.*;

public class TestArrayLists {
    public static void main(String [] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mufasa");
        names.add("Sarabi");
        names.add("Scar");

        System.out.println(names);

        names.add(3, "Pumba");

        System.out.println(names);
    }
    
}
