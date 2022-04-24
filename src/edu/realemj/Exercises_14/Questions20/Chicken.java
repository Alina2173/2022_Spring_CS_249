package edu.realemj.Exercises_14.Questions20;

public class Chicken extends Animal implements Edible, Noisy {
    public String howToEat() {
        return "Fried chicken";
    }
    
    public String makeNoise() {
        return "BWAAAAAAK";
    }
}
