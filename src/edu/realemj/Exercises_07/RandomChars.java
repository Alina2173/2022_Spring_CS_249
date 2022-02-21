package edu.realemj.Exercises_07;

public class RandomChars {

    public static char randomChar(char start, char end) {
        int range = end - start + 1;        
        char c = (char)(start + Math.random()*range);
        return c;
    }

    public static char randomDigit() {
        return randomChar('0', '9');        
    }
    
    public static char randomLowercase() {
        return randomChar('a', 'z');
    }

    public static char randomUppercase() {
        return randomChar('A', 'Z');
    }
}
