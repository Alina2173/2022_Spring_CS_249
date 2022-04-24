package edu.realemj.Exercises_14;

import edu.realemj.Exercises_10.*;

public class TestCircles {
    public static void main(String [] args) {

        try {
            Circle c0 = new Circle();

            Circle c1 = new Circle(3.0, true, new Point2D(5,7));
            System.out.println(c1.getCenter());

            Shape s1 = new Rectangle(6,7, true, new Point2D(8,9));

            System.out.println("CIRCLE: " + c1);
            System.out.println("SHAPE: " + s1);

            Shape s2 = new Circle(9.8, false, new Point2D(1,2));
            System.out.println(s2);
            double r = ((Circle)s2).getRadius();

            Shape s3 = new Rectangle(3, 8, true, new Point2D(7,1));
            System.out.println(s3);

            //r = ((Circle)s3).getRadius();

            Shape [] allShapes = new Shape[5];
            allShapes[0] = c1;
            allShapes[1] = s1;
            allShapes[2] = s2;
            allShapes[3] = s3;
            allShapes[4] = new Rectangle();

            for(Shape s: allShapes) {
                System.out.println("* " + s);
                System.out.println("\tArea = " + s.getArea());
            }
        
            printShape(c1);
            printShape(new Rectangle(2,3));

            System.out.println("NEW RADIUS: " + c1.getRadius());
        }
        catch(InvalidRadiusException e) {
            System.err.println("RADIUS ERROR: " + e.getMessage());
        }
        catch(Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }        
    }    

    public static void printShape(Shape s) throws InvalidRadiusException {
        System.out.println("** BEHOLD THIS GLORIOUS SHAPE **");
        System.out.println(s);

        // Is this a Circle?
        /*
        if(s instanceof Circle) {
            //double r = ((Circle)s).getRadius();
            Circle c = (Circle)s;
            double r = c.getRadius();            
            System.out.println("ITS RADIUS WAS " + r);
            c.setRadius(9.9);
        }
        */

        // AFTER JDK 16
        if(s instanceof Circle c) {            
            double r = c.getRadius();            
            System.out.println("ITS RADIUS WAS " + r);
            c.setRadius(9.9);
        }
        else if(s instanceof Rectangle r) {
            System.out.println("width = " + r.getWidth());
            System.out.println("IS IT NOT ANGULAR AND GLORIOUS?");
        }

        System.out.println("...glorious.");
    }
}
