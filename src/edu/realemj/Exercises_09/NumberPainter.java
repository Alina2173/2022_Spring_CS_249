package edu.realemj.Exercises_09;
import java.util.*;

public class NumberPainter {

    public static void main(String [] args) {
        final int ROW_CNT = 10;
        final int COL_CNT = 15;

        int [][] canvas = new int[ROW_CNT][COL_CNT];
        Scanner input = new Scanner(System.in);

        boolean validIndex = true;

        do {
            // Get location and value
            System.out.println("Enter row, column, and value:");
            int row = input.nextInt();
            int col = input.nextInt();
            int value = input.nextInt();

            // Check if location valid
            validIndex = checkValidLocation(row, col, canvas);

            // If valid, paint to canvas
            if(validIndex) {
                canvas[row][col] = value;
            }

            // Print canvas
            printCanvas(canvas);

        }while(validIndex);
    }

    public static boolean checkValidLocation(
                                int row,
                                int col, 
                                int [][] canvas) {

        return (row < canvas.length && row >= 0 &&
                col < canvas[0].length && col >= 0);
    }

    public static void printCanvas(int [][] canvas) {
        for(int i = 0; i < canvas.length; i++) {
            for(int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j]);
            }
            System.out.println("");
        }
    }    
}
