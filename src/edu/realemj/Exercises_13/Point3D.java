package edu.realemj.Exercises_13;

import java.util.Scanner;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D() {}

    public Point3D(double nx, double ny, double nz) {
        setPos(nx, ny, z);
    }

    public Point3D(Point3D other) {
        setPos(other);
    }

    public Point3D(String s) {
        this(new Scanner(s));
        //Scanner tokens = new Scanner(s);
        //ouble x = tokens.nextDouble();
        //double y = tokens.nextDouble();
        //double z = tokens.nextDouble();
        //setPos(x,y,z);
    }

    public Point3D(Scanner tokens) {
        double x = tokens.nextDouble();
        double y = tokens.nextDouble();
        double z = tokens.nextDouble();
        setPos(x,y,z);
        // setPos(    tokens.nextDouble(),
        //            tokens.nextDouble(),
        //            tokens.nextDouble());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double nx) {
        x = nx;
    }

    public void setY(double ny) {
        y = ny;
    }

    public void setZ(double nz) {
        z = nz;
    }

    public void setPos(double nx, double ny, double nz) {
        setX(nx);
        setY(ny);
        setZ(nz);
    }

    public void setPos(Point3D other) {
        //setX(other.getX());
        //setY(other.getY());
        setX(other.x);
        setY(other.y);
        setZ(other.z);
    }    

    public String toString() {
        return x + " " + y + " " + z;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point3D p) {
            final double ERROR = 1e-15;

            return (Math.abs(x - p.x) < ERROR &&
                    Math.abs(y - p.y) < ERROR &&
                    Math.abs(z - p.z) < ERROR);
        }
        else {
            return false;
        }
    }

    public void scaleY(double factor) {
        y = factor*y;
    }
}
