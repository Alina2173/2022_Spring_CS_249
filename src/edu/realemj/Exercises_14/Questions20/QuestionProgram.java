package edu.realemj.Exercises_14.Questions20;

import java.util.*;

public class QuestionProgram {
    public static void main(String [] args) {
        Chicken a1 = new Chicken();
        
        Apple p1 = new Apple();

        Salt m1 = new Salt();

        Edible allFood[] = new Edible[3];
        allFood[0] = a1;
        allFood[1] = p1;
        allFood[2] = m1;

        for(Edible e: allFood) {
            System.out.println(e.howToEat());
        }
        
        ArrayList<Object> allStuff = new ArrayList<>();
        allStuff.add(new Chicken());
        allStuff.add(new Cedar());
        allStuff.add(new Salt());
        allStuff.add(new Magnesium());
        allStuff.add(new Apple());

        for(Object o: allStuff) {
            if(o instanceof Edible e) {
                System.out.println(e.howToEat());
            }

            if(o instanceof Noisy n) {
                System.out.println(n.makeNoise());
            }
        }



    }    
}
