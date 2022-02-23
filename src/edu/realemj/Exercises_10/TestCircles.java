package edu.realemj.Exercises_10;

public class TestCircles {
    public static void main(String [] args) {
        Circle c = new Circle();
        Circle c2 = new Circle();

        Point2D p = new Point2D(5,6);
        c.setCenter(p);  
        c2.setCenter(p);

        c.setCenter(7,8);
         
        p.setX(27);

    }
    
}
