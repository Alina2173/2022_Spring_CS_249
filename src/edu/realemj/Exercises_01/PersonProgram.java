package edu.realemj.Exercises_01;

public class PersonProgram {
    public static void main(String [] args) {

        Person bob = new Person();
        bob.setAge(20);
        System.out.println(bob.getAge());
        bob.setAge(68);
        System.out.println(bob.getAge());

        Person sue = new Person();
        sue.setAge(23);
        System.out.println(sue.getAge());
        System.out.println(bob.getAge());

        int mon = Person.calcMonths(3);
        System.out.println(mon);
    }    
}
