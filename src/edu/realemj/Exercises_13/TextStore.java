package edu.realemj.Exercises_13;

import java.io.*;
import java.util.*;

public class TextStore {

    public static void main(String [] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter file path:");
        String path = userInput.nextLine();

        try (
            PrintWriter writer = new PrintWriter(path);   
        ) {
            
            String line = "";
            System.out.println("Enter text to insert:");
            do {
                line = userInput.nextLine();
                writer.println(line);                
            } while(line.length() > 0);
            //writer.close();
        }
        catch(Exception e) {
            System.err.println("ERROR: " + e);
        }
    }
    
}
