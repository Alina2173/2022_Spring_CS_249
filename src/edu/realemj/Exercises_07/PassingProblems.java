package edu.realemj.Exercises_07;
import edu.lina1.Exercises_01.*;

public class PassingProblems {
    public static void doesNothing(int x) {
        x++; // x = x + 1
    }

    public static void doesNothing(String s) {
        s = "HELP!";
    }

    public static void doesNothing(Person p) {
        p = new Person();
    }

    public static void doesSomething(Person p) {
        p.setAge(42);
    }

    public static void doesSomething(NumberBucket b) {
        b.num = 78;
    }
    public static void main(String [] args) {
        int z = 6;
        doesNothing(z);
        System.out.println(z);

        String w = "Hello!";
        doesNothing(w);
        System.out.println(w);

        Person q = new Person();
        q.setAge(93);
        doesNothing(q);
        System.out.println(q.getAge());

        doesSomething(q);
        System.out.println(q.getAge());

        NumberBucket c = new NumberBucket();
        c.num = 12;
        doesSomething(c);
        System.out.println(c.num);
    }
    
}

class NumberBucket {
    // JUST FOR DEMONSTRATION; DON'T MAKE DATA PUBLIC!!!!!!!
    public int num;
}
