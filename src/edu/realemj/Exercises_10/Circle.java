package edu.realemj.Exercises_10;

public class Circle {
    private double radius;
    private Point2D center = new Point2D();

    public Circle() {}

    public Circle(double r, Point2D p) {
        setRadius(r);
        setCenter(p);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = Math.max(r, 0);
    }

    public Point2D getCenter() {
        //return center;
        return new Point2D(center.getX(), center.getY());
    }    

    public void setCenter(Point2D p) {
        //center = p;
        center.setPos(p.getX(), p.getY());
    }

    public void setCenter(double x, double y) {
        center.setPos(x, y);
    }
}
