package edu.lina1.Assign08;

public class Rat extends Creature{
    public Rat(){

    }

    public Rat(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Rat at " + getRow() + "," + getCol();
    }

    public void draw(CharImage map){
       map.setPos(row, col, 'R');
    }
    
}
