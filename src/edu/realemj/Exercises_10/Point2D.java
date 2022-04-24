package edu.realemj.Exercises_10;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {}

    public Point2D(double nx, double ny) {
        setPos(nx, ny);
    }

    public Point2D(Point2D other) {
        setPos(other);
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

    public void setPos(Point2D other) {
        //setX(other.getX());
        //setY(other.getY());
        setX(other.x);
        setY(other.y);
    }    

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point2D p) {
            final double ERROR = 1e-15;

            return (Math.abs(x - p.x) < ERROR &&
                    Math.abs(y - p.y) < ERROR);
        }
        else {
            return false;
        }
    }
}
