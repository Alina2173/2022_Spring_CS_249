package edu.realemj.Exercises_13;

import edu.realemj.Exercises_10.*;
import edu.realemj.Exercises_12.*;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) throws InvalidRadiusException {        
        setRadius(radius);
    }

    public Circle(double radius, boolean filled, Point2D center)
        throws InvalidRadiusException {
            
        super(filled, center);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) 
        throws InvalidRadiusException {

        //this.radius = Math.max(radius, 0);
        if(radius < 0) {
            throw new InvalidRadiusException(radius);
        }

        this.radius = radius;
    }    

    @Override
    public String toString() {
        String s = super.toString();
        s += " which is a circle with radius " + radius;
        return s;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle c) {
            final double ERROR = 1e-15;
            return (Math.abs(radius - c.radius) < ERROR &&
                    super.equals(other));
        }
        else { 
            return false;
        }
    }
}
