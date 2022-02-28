package edu.realemj.Exercises_10;

public class InstanceDance {
    private int cnt = 0;
    private static int data = 5;

    public int multiplyCnt(int x) {
        // In instance, calling static --> OK
        int y = doMultiply(cnt, x); // cnt*x;
        // In instance, use static data --> OK
        y += data;
        return y;
    }

    public int divideCnt(int x) {
        int y = cnt/x;
        return y;
    }

    public static int doMultiply(int a, int b) {
        int result = a*b;
        // In static, trying to call instance --> NO
        // int z = divideCnt(a);
        // In static, trying to use instance data --> NO
        // result += cnt;
        return result;
    }

    public static void main(String [] args) {
        // INSTANCE
        InstanceDance d = new InstanceDance();
        int z = d.multiplyCnt(5);
        // NOPE: int e = InstanceDance.multiplyCnt(9);

        // STATIC 
        int p = InstanceDance.doMultiply(7,8);
    }
    
}
