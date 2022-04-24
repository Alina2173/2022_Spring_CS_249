package edu.realemj.Exercises_14;

import edu.realemj.Exercises_10.*;

public abstract class Shape {
    private boolean filled = false;
    private Point2D center = new Point2D();

    protected Shape() {}

    protected Shape(boolean filled, Point2D center) {
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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Shape s) {
            return (filled == s.filled && center.equals(s.center));
        }
        else {
            return false;
        }
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
