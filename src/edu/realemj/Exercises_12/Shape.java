package edu.realemj.Exercises_12;

import edu.realemj.Exercises_10.*;

public class Shape {
    private boolean filled = false;
    private Point2D center = new Point2D();

    public Shape() {}

    public Shape(boolean filled, Point2D center) {
        this.filled = filled;
        this.center.setPos(center);        
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setCenter(Point2D center) {
        this.center.setPos(center);
    }

    public Point2D getCenter() {
        return new Point2D(center);
    }  
    
    public String toString() {
        String s = "";
        if(filled) {
            s += "Filled ";
        }
        else {
            s += "Empty ";
        }
        s += "shape at " + center;
        return s;
    }
}
