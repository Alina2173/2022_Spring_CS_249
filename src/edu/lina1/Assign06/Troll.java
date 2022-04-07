package edu.lina1.Assign06;

public class Troll extends Giant {

    public Troll(String name){
        super(name);
    }
    
    public String toString(){

        return "Troll " + super.toString();
    }

    public String cook(){
        return "Mutton again...";
    }
}
