package edu.realemj.Exercises_10;
import java.util.*;
import edu.realemj.Exercises_06.*;
import edu.realemj.Exercises_01.*;

public class OregonGame {
    public static void main(String [] args) {
        Supplies supplies = new Supplies();
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter number of people:");
        //int partyCnt = input.nextInt();
        PartyState party = PartyState.askForParty(input);

        GeneralStore startStore = new GeneralStore("Mr. MacGuffin's Output");
        startStore.visit(input, supplies);
        
        int trailCounter = 0;
        final double DISASTER_RATE = 0.5;

        while(!supplies.areOutOfFood() && party.areAnyAlive()) {
            trailCounter++;
            System.out.println("DAY " + trailCounter);

            if(Math.random() < DISASTER_RATE) {
                Person death = party.killRandom();
                System.out.println(death.getName() + " has passed on.");
            }
            
            supplies.eatDaysRations(party.getCountAlive()); // partyCnt);
            
            System.out.println(supplies);
            System.out.println(party);
        }

        System.out.println("Survived " + trailCounter + " days.");
    }
    
}
