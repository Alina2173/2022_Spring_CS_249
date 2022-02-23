package edu.realemj.Exercises_10;
import java.util.*;
import edu.realemj.Exercises_06.*;

public class OregonGame {
    public static void main(String [] args) {
        Supplies supplies = new Supplies();
        Scanner input = new Scanner(System.in);

        GeneralStore startStore = new GeneralStore("Mr. MacGuffin's Output");
        startStore.visit(input, supplies);

        System.out.println("Enter number of people:");
        int partyCnt = input.nextInt();

        int trailCounter = 0;

        while(!supplies.areOutOfFood()) {
            trailCounter++;
            supplies.eatDaysRations(partyCnt);
            System.out.println("DAY " + trailCounter);
            System.out.println(supplies);
        }

        System.out.println("Survived " + trailCounter + " days.");
    }
    
}
