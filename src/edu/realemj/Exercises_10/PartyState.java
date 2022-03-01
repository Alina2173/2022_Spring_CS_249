package edu.realemj.Exercises_10;

import edu.realemj.Exercises_01.*;
import java.util.*;

public class PartyState {
    private Person [] party;

    public PartyState(String [] names) {
        party = new Person[names.length];
        for(int i = 0; i < party.length; i++) {
            party[i] = new Person(names[i]);
        }
    }

    public String toString() {
        String s = "CURRENT PARTY:" + "\n";
        for(Person p: party) {
            if(p.isAlive()) {
                s += "* " + p + "\n";
            }
        }  
        return s;
    }

    public boolean areAnyAlive() {
        /*
        boolean anyAlive = false;
        for(Person p: party) {
            if(p.isAlive()) {
                anyAlive = true;
                break;
            }
        }
        return anyAlive;
        */

        return (getCountAlive() > 0);
    }

    public int getCountAlive() {
        int aliveCnt = 0;
        for(Person p: party) {
            if(p.isAlive()) {
                aliveCnt++;
            }
        }
        return aliveCnt;
    }

    public Person killRandom() {
        // If anyone is alive...
        if(areAnyAlive()) {
            // Find all Persons alive
            int aliveCnt = 0;
            Person [] peopleLiving = new Person[party.length];
            for(Person p: party) {
                if(p.isAlive()) {
                    peopleLiving[aliveCnt] = p;
                    aliveCnt++;
                }
            }

            // Pick random person
            int kindex = (int)(Math.random()*aliveCnt);
            // Kill them off
            Person unlucky = peopleLiving[kindex];
            unlucky.murder();

            // Return
            return unlucky;
        }
        else {
        // Otherwise
            // Return null
            return null;
        }
    }

    public static PartyState askForParty(Scanner input) {
        System.out.println("How many people?");
        int peopleCnt = input.nextInt();
        String [] names = new String[peopleCnt];
        System.out.println("Enter names:");
        for(int i = 0; i < names.length; i++) {
            String n = input.next();
            names[i] = n;
        }

        PartyState p = new PartyState(names);
        return p;
    }

    
}
