package edu.lina1.Exercises_01;

public class Person {
    private int age;
    private String name;
    private boolean alive = true;

    public Person() {
        name = "";
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }   

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public boolean isAlive() {
        return alive;
    }
    
    public static int calcMonths(int years) {
        // Calculate months
        int m = years*12;
        return m;
    }

    public String toString() {
        String s = name + ", age " + age;
        if(!alive) {
            s += " (deceased)";
        }
        return s;
    }
}
