package edu.lina1.Assign03;
import java.util.Random;
import java.util.Scanner;

public class CharGen {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter seed:");
        int seed = input.nextInt();
        Random rand = new Random();
        rand.setSeed(seed);

        System.out.println("Enter class:");
        String className = input.next();
        className = className.toUpperCase();

        while((className.equals("RANGER"))||(className.equals("WIZARD")) || (className.equals("WARRIOR")) || (className.equals("PEASANT"))){

    

            //System.out.println("TEST classname: " + className);
            
            if (className.equals("RANGER")){
                int strength = 50;
                int wisdom = 50;

                strength = strength + rand.nextInt(51);
                wisdom = wisdom + rand.nextInt(51);
    
                System.out.println("CLASS: " + className);
                System.out.println("STRENGTH: " + strength);
                System.out.println("WISDOM: " + wisdom);

            }else if(className.equals("WIZARD")){
                int strength = 0;
                int wisdom = 50;
                
                strength = strength + rand.nextInt(51);
                wisdom = wisdom + rand.nextInt(51);
    
                System.out.println("CLASS: " + className);
                System.out.println("STRENGTH: " + strength);
                System.out.println("WISDOM: " + wisdom);

            }else if(className.equals("WARRIOR")){
                int strength = 50;
                int wisdom = 0;

                strength = strength + rand.nextInt(51);
                wisdom = wisdom + rand.nextInt(51);
    
                System.out.println("CLASS: " + className);
                System.out.println("STRENGTH: " + strength);
                System.out.println("WISDOM: " + wisdom);

            }else if(className.equals("PEASANT")){ 
                int strength = 0;
                int wisdom = 0;

                strength = strength + rand.nextInt(51);
                wisdom = wisdom + rand.nextInt(51);
    
                System.out.println("CLASS: " + className);
                System.out.println("STRENGTH: " + strength);
                System.out.println("WISDOM: " + wisdom);
            }
            
        
            System.out.println("Enter class:");
            className = input.next();
            className = className.toUpperCase();
        }

        System.err.println("UNKNOWN CLASS: " + className);
        
    }
}
