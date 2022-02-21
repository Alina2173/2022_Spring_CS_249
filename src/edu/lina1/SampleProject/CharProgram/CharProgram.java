package edu.lina1.SampleProject.CharProgram;
import edu.lina1.SampleProject.Character.*;
import java.util.*;

public class CharProgram {
    public static void main( String [] args){

        Hayato alice = new Hayato();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Nickname: ");
        String nickname = input.next();


        alice.setNickname(nickname);

        

        
    }
}
