package edu.realemj.Exercises_08;

public class RandCheck {

    public static int[] getRandomArray(int cnt, int range) {
        int [] numbers = new int[cnt];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*range);
        }
        return numbers;
    }

    public static double[] calcHistogram(int [] data, int range) {
        double [] hist = new double[range];
        for(int x: data) {
            hist[x] += 1.0;
        }
        for(int i = 0; i < hist.length; i++) {
            hist[i] /= data.length;
        }
        return hist;
    }

    public static void printHistogram(double [] hist) {
        System.out.println("HISTOGRAM:");
        for(int i = 0; i < hist.length; i++) {
            System.out.println(i + ": " + hist[i]);
        }
    }

    public static void main(String [] args) {
        int cnt = 100000; //1000;
        int range = 10;
        int [] nums = getRandomArray(cnt, range);
        double [] hist = calcHistogram(nums, range);
        printHistogram(hist);
    }    
}
