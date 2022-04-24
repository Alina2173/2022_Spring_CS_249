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

    public void clear() {
        vertices.clear();
        indices.clear();
    }

    public void load(String filename) throws IOException {
        clear();

        try (
            Scanner fileInput = new Scanner(new File(filename));
        ) {
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                line = line.trim();
                if(line.length() > 0) {
                    Scanner tokens = new Scanner(line);
                    String type = tokens.next();
                    switch(type) {
                        case "v" -> {
                            /*
                            // METHOD 1
                            double x = tokens.nextDouble();
                            double y = tokens.nextDouble();
                            double z = tokens.nextDouble();
                            Point3D p = new Point3D(x, y, z);
                            */

                            // METHOD 2
                            //String rest = tokens.nextLine();
                            //Point3D p = new Point3D(rest);

                            // METHOD
                            Point3D p = new Point3D(tokens);

                            vertices.add(p);
                        }
                        case "f" -> {
                            indices.add(tokens.nextInt());
                            indices.add(tokens.nextInt());
                            indices.add(tokens.nextInt());
                        }
                        default -> {}
                    }
                }
            }
        }
        catch(Exception e) {
            clear();
            throw new IOException("Could not load OBJ file!", e);
        }
    }    

    public void scaleY(double factor) {
        for(Point3D p: vertices) {
            p.scaleY(factor);
        }
    }
}
