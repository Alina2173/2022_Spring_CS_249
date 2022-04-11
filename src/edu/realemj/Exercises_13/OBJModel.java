package edu.realemj.Exercises_13;

import java.util.*;
import java.io.*;

public class OBJModel {
    private ArrayList<Point3D> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void save(String filename) throws IOException {
        try (
            PrintWriter writer = new PrintWriter(filename);
        ) {
            // v x y z
            for(Point3D v: vertices) {
                writer.println("v " + v);
            }

            // f i1 i2 i3
            for(int i = 0; i < indices.size(); i += 3) {
                writer.println("f " +
                                indices.get(i) + " " +
                                indices.get(i+1) + " " +
                                indices.get(i+2));
            }
        }
    }
    
}
