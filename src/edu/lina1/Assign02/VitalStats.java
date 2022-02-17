package edu.lina1.Assign02;
import java.util.Scanner;

public class VitalStats {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String FirstName = input.next();
        String LastName = input.next();

        System.out.println("Enter height in inches: ");
        int totalInches = input.nextInt();
        int feet = (totalInches / 12);
        int leftoverInches = (totalInches % 12);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        double BMI_Double = (703 * weight / (totalInches * totalInches));
        int BMI = (int) BMI_Double;

        System.out.println("NAME: " + LastName + ", " + FirstName);
        System.out.println("WEIGHT: " + weight + " lbs.");
        System.out.println("HEIGHT: " + feet + "'-" + leftoverInches + "\"");
        System.out.println("BMI: " + BMI);

    }
}
