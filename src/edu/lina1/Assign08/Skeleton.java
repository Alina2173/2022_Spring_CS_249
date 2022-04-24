package edu.lina1.Assign08;

public class Skeleton extends Creature{
    public Skeleton(){

    }

    public Skeleton(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Skeleton at " + getRow() + "," + getCol();
    }
    
    public void draw(CharImage map){
        map.setPos(row, col, 'S');
    }



}
