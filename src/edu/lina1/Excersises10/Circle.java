package edu.lina1.Excersises10;

public class Circle {
    private double radius;
    private Point2D center = new Point2D();

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = Math.max(r, 0); //anything less than 0 is set to 0
    }

    public Point2D getCenter(){
        //return center;
        return new Point2D(center.getX(), center.getY());
    }
    
    


}
