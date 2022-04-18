package edu.realemj.Exercises_14;

import edu.realemj.Exercises_10.*;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, 
                    double height,
                    boolean filled,
                    Point2D center) {
        super(filled, center);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        String s = super.toString();
        s += " which is a " + width + " x " + height + " rectangle";
        return s;
    }  
    
    @Override 
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2.0*(width + height);
    }
}
