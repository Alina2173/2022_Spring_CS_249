package edu.realemj.Exercises_13;

import java.util.*;
import java.io.*;

public class Quotient {
    public static int quotient(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("YOU FOOL!");
        }
        int result = a/b;
        return result;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int r = quotient(x,y);
            System.out.println("Result: " + r);
        }
        catch(ArithmeticException ex) {
            System.err.println(ex.getMessage());
            System.err.println("YOU HAVE DESTROYED THE UNIVERSE!!!");
        }
        catch(InputMismatchException ex) {
            System.err.println("BAD ENTRY!!!!");
        }

        System.out.println("Life goes on...");
    }
    
}
