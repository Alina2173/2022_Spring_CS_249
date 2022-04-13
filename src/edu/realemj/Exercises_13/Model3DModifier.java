package edu.realemj.Exercises_13;

public class Model3DModifier {
    public static void main(String [] args) {
        OBJModel model = new OBJModel();

        try {
            model.load("bunny.obj");
            model.scaleY(2.0);
            model.save("stretchedBunny.obj");
        }
        catch(Exception e) {
            System.err.println("ERROR: " + e);
        }
    }
    
}
