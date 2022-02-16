package edu.realemj.Exercises_08;
import edu.realemj.Exercises_01.*;

public class OrganTrail {

    public static void main(String [] args) {
        Person p = new Person("Bob", 27);

        Person [] party = new Person[4];
        party[0] = new Person("Rick", 29);
        party[1] = new Person("Lori", 27);
        party[2] = new Person("Coral", 11);
        party[3] = new Person("Shane", 31);

        String [] disaster = {
            "a broken leg",
            "dysentery", 
            "been bitten by a walker",
            "been hit in the face by a bat in a way no one was happy with"
        };

        int pchoice = (int)(Math.random()*party.length);
        int dchoice = (int)(Math.random()*disaster.length);

        System.out.println(party[pchoice].getName()
                            + " has "
                            + disaster[dchoice]);


    }
    
}
