package edu.realemj.Exercises_02;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        // Absolute value
        // radius = Math.abs(r);

        // Set zero
        if(r < 0) {
            radius = 0;
        }
    }
    
}
