package edu.lina1.Assign06;

public class Huorn extends Tree{
    public Huorn(String name){
        super(name);
    }

    public String toString(){
        return "Huorn " + super.toString();
    }

    public String speak(){
        return "<angry rustling>";
    }
    
}
