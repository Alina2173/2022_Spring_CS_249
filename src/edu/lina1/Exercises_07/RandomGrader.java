package edu.lina1.Exercises_07;
import java.util.*;

public class RandomGrader {

    public static int getNumberOfStudents(Scanner data) {
        System.out.println("Enter number of students:");
        int num = data.nextInt();
        return num;
    }

    public static double getRandomGrade() {
        // [50, 100]
        double g = 51*Math.random() + 50; // [50, 101)
        g = Math.min(g, 100.0);
        return g;
    }

    public static String convertToLetterGrade(double num) {
        String letter = "F";
        if(num >= 90) {
            letter = "A";
        }
        else if(num >= 85) {
            letter = "B+";
        }
        else if(num >= 80) {
            letter = "B";
        }
        else if(num >= 75) {
            letter = "C+";
        }
        else if(num >= 70) {
            letter = "C";
        }
        else if(num >= 65) {
            letter = "D+";
        }
        else if(num >= 60) {
            letter = "D";
        }
        return letter;
    }

    public static void printGrade(String name, String letter, double num) {
        String letterForm = String.format("%-2s", letter);
        String numForm = String.format("%5.1f", num);
        System.out.println("** " + name + ":\t" + letterForm + " (" + numForm + ")");
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Get number of students
        int numStudents = getNumberOfStudents(input);

        // For each student
        double sum = 0.0;

        for(int i = 0; i < numStudents; i++) {
            // Assign random grade [50, 100]
            double grade = getRandomGrade();

            // Get the letter grade
            String letter = convertToLetterGrade(grade);

            // Print out letter and number
            printGrade("Student " + (i+1), letter, grade);

            // Add number grade to sum
            sum += grade;
        }

        // Calculate average number grade
        double aveGrade = sum / numStudents;

        // Print average letter and number
        String aveLetter = convertToLetterGrade(aveGrade);
        printGrade("AVERAGE", aveLetter, aveGrade);

    }
    
}
