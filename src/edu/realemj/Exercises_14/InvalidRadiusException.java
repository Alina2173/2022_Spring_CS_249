package edu.realemj.Exercises_14;

public class InvalidRadiusException extends Exception {
    private double badRadius;

    public InvalidRadiusException() {
        // super();
    }

    public InvalidRadiusException(String message) {
        super(message);
    }

    public InvalidRadiusException(String message, Exception cause) {
        super(message, cause);
    }

    public InvalidRadiusException(double radius) {
        super("Bad radius: " + radius);
        badRadius = radius;
    }

    public double getBadRadius() {
        return badRadius;
    }

}
