package edu.realemj.Exercises_08;
import java.util.*;

public class CopyFun {

    public static void printGrid(int [] grid) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                int index = i*10 + j;
                System.out.print(grid[index]);
            }
            System.out.println("");
        }
    }
    public static void main(String [] args) {

        int [] target = new int[100];
        printGrid(target);

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers?");
        int cnt = input.nextInt();
        int [] data = new int[cnt];
        System.out.println("Enter data:");
        for(int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }
        System.out.println("Enter start location:");
        int start = input.nextInt();

        System.arraycopy(data, 0, target, start, data.length);

        printGrid(target);
        


    }
    
}
