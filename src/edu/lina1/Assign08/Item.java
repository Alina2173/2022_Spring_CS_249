package edu.lina1.Assign08;

import java.util.Scanner;

public class Item implements Loadable{
    protected String ID;
    protected int value;
    
    
    public Item(){
        ID = "";
        value = 0;
    }

    public Item(String ID, int value){

        this.ID = ID;
        this.value = value;
    }

    public String getID(){
        return this.ID;
    }

    public int getValue(){
        return this.value;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        return ID + " with value " + value;
    }

    public void load (Scanner input) throws GameFileException{
        try{
            this.ID = input.next();
            this.value = input.nextInt();
        }
        catch(Exception e){
            setID("");
            setValue(0);
            throw new GameFileException("Error loading Item", e);
        }
    }



}
