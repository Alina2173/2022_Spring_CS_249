package edu.lina1.Assign05;

public class CharImage {

    private char [][] array;
    private int rowCnt;
    private int colCnt;
    private char fillChar;

    
    public CharImage(int rowCnt, int colCnt, char fillChar){

        //set row, col and fillChar value
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;

        //Allocate space for 2D char array
        array = new char[rowCnt][colCnt];

        //Fill 'array' with 'fillChar'
        for (int i = 0; i < rowCnt; i++){
            for (int j = 0; j < colCnt; j++){
                array[i][j] = fillChar;

            }
        }

    }

    public void clear(){
        //Fill 'array' with 'fillChar'
        for (int i = 0; i < rowCnt; i++){
            for (int j = 0; j < colCnt; j++){
                array[i][j] = fillChar;

            }
        }
    }


    public int getRowCnt(){
        return rowCnt;
    }

    public int getColCnt(){
        return colCnt;
    }

    public boolean isValidPosition(int row, int col){

        if (row < rowCnt && row >= 0){
            if (col < colCnt && col >= 0){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }


    public char getPos(int row, int col){
        if (isValidPosition(row, col) == true){    
            return array[row][col];

        }
        else{
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row, col) == true){    
            array[row][col] = c;
            return true;

        }
        else{
            return false;
        }
    }


    public String toString(){
        return rowCnt + " x " + colCnt + " CharImage (default: " + fillChar +")";

    }


    //put the array into a single char String
    public String getMapString(){

        //String to put array into
        String s = "";

        for (int i = 0; i < rowCnt; i++){
           for (int j = 0; j < colCnt; j++){

                s += String.valueOf(array[i][j]);
                
            }

            s += "\n";
        }

        return s;
    }


}
