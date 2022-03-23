package edu.lina1.Assign04;
import java.util.*;

public class PrintShop {


    public static BusinessCard askForBusinessCardData(Scanner input){
        System.out.println("Enter business name:");
        String name = input.nextLine();

        System.out.println("Enter boundary character:");
        char boundaryChar = input.nextLine().charAt(0);
        //setBoundaryChar(input.next().charAt(0));

        //ask user for slogan lines and store into array
        String [] sloganLines = new String[4];
        System.out.println("Enter slogan (max 4 lines):");
        for (int i = 0; i < 4 ; i++){
            sloganLines[i] = input.nextLine();
        }

        BusinessCard b = new BusinessCard(name, sloganLines, boundaryChar);
        
        return b;
    }

    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);

        BusinessCard card = askForBusinessCardData(input);
		System.out.println("Your new business card:");
		System.out.println(card);
        
    
    }


}
