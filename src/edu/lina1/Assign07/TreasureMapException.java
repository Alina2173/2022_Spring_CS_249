package edu.lina1.Assign07;

public class TreasureMapException extends Exception {
    
    public TreasureMapException(String message){
        //calls super(message) in this constructor
        super(message);
    }

    public TreasureMapException (String message, Exception e){
        super(message, e);
    }

}
