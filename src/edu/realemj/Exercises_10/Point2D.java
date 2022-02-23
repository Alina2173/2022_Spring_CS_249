package edu.realemj.Exercises_10;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {}

    public Point2D(double nx, double ny) {
        setPos(nx, ny);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double nx) {
        x = nx;
    }

    public void setY(double ny) {
        y = ny;
    }

    public void setPos(double nx, double ny) {
        setX(nx);
        setY(ny);
    }
    
}
