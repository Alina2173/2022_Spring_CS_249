package edu.realemj.Exercises_10;

public class Circle {
    private double radius;
    private Point2D center = new Point2D();

    public Circle() {
        // Call most general version
        this(1.0, new Point2D());        
    }

    public Circle(double radius) {
        this(radius, new Point2D());
    }

    public Circle(Point2D center) {
        this(1.0, center);
    }

    public Circle(double radius, Point2D center) {
        setRadius(radius);
        setCenter(center);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public Point2D getCenter() {
        //return center;
        return new Point2D(center.getX(), center.getY());
    }    

    public void setCenter(Point2D center) {
        //center = p;
        this.center.setPos(center.getX(), center.getY());
    }

    public void setCenter(double x, double y) {
        center.setPos(x, y);
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
