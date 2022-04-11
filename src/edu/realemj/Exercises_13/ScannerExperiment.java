package edu.realemj.Exercises_13;

import java.util.*;
import java.io.*;

public class ScannerExperiment {
    public static void main(String [] args) {
        // Scanner that reads from System.in
        Scanner s1 = new Scanner(System.in);

        // Scanner that parses a String
        Scanner s2 = new Scanner("a b c d");
        while(s2.hasNext()) {
            System.out.println("* " + s2.next());
        }
        System.out.println("DONE");

        // Scanner that is STILL parsing a String
        Scanner s3 = new Scanner("SECRETS.txt");
        System.out.println(s3.next());

        // Scanner that reads from a file
        try {
            Scanner s4 = new Scanner(new File("./SECRETS.txt"));
            System.out.println(s4.next());

            File myFile = new File("SECRETS.txt");
            File notFile = new File("SORCERY.txt");

            if(myFile.exists()) {
                System.out.println(myFile.getPath() + " EXISTS!");
            }

            if(notFile.exists()) {
                System.out.println(notFile.getPath() + " EXISTS!");
            }
        }
        catch(Exception e) {
            System.err.println("ERROR: " + e);
        }


    }    
}
