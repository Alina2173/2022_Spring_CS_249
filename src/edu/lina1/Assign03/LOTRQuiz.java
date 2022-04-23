package edu.lina1.Assign03;
import java.util.*;

public class LOTRQuiz {
    public static void main (String [] args) {
        System.out.println("Enter strength and wisdom:"); 
        
        Scanner input = new Scanner(System.in);

        int strength = input.nextInt();
        int wisdom = input.nextInt();

        if (strength < 0 || wisdom < 0){
            System.err.println("ERROR: Negative entry!");
        }else if (strength >= 50 && wisdom >=50){
            //strong AND wise
            System.out.println("ARAGORN!");
        }else if (strength >= 50 && wisdom < 50){
            //strong but NOT wise
            System.out.println("BOROMIR!");    
        }else if (strength < 50 && wisdom >= 50){
            //NOT strong but wise
            System.out.println("GANDALF!");
        }else {
            //NEITHER strong NOR wise
            System.out.println("GOLLUM!");
        }

        input.close();
    }
}
