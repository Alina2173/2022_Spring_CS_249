package edu.realemj.Exercises_13;

import java.util.*;
import java.io.*;

public class SecretNumber {

    public static int getSecret() throws IOException {
        Scanner reader = new Scanner(new File("SECRETS.txt"));
        int secret = reader.nextInt();
        reader.close();
        return secret;
    }

    public static void storeSecret(int secret) throws IOException {
        PrintWriter writer = new PrintWriter(new File("SECRETS.txt"));
        writer.println(secret);
        writer.close();
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        try {            
            int secret = getSecret();
            System.out.println("CURRENT SECRET: " + secret);
        }
        catch(IOException e) {
            System.err.println("ERROR: Couldn't read secrets!");
            //e.printStackTrace();
        }

        try {
            System.out.println("Enter new secret:");
            int secret = input.nextInt();
            storeSecret(secret);
        }
        catch(IOException e) {
            System.err.println(e);
        }

        System.out.println("SECRETS DONE.");
    }    
}
