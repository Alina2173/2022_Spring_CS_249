package edu.realemj.Exercises_12;

import edu.realemj.Exercises_10.*;

public class TestCircles {
    public static void main(String [] args) {
        Circle c1 = new Circle(3.0, true, new Point2D(5,7));
        System.out.println(c1.getCenter());

        Shape s1 = new Shape(true, new Point2D(8,9));

        System.out.println("CIRCLE: " + c1);
        System.out.println("SHAPE: " + s1);
    }    
}
