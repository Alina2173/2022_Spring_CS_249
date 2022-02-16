package edu.lina1.Exercises_07;
import java.util.*;

public class ScannerProblems {

    public static int getInt(Scanner in) {
        int num = in.nextInt();
        return num;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        //int x = input.nextInt();
        int x = getInt(input);
        System.out.println("Your number: " + x);
    }    
}
