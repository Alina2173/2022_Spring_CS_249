package edu.lina1.Assign07;
import java.io.*;
import java.util.*;

import edu.lina1.Assign08.CharImage;


public class TreasureMap extends CharImage{

    private int curRow ;
    private int curCol ;


    public TreasureMap(int rowCnt, int colCnt, char fillChar){
        super(rowCnt, colCnt, fillChar);

        curRow = 0;
        curCol = 0;

        //if not specified as default, the current row and column should be set to zero
    }

    public void clear(){
        //set current row and column to zero
        curRow = 0;
        curCol = 0;
        super.clear();
    }
    
    public int getCurRow(){
        return curRow;
    }

    public int getCurCol(){
        return curCol;
    }

    public void setCurRow(int row){
        curRow = row;
    }

    public void setCurCol(int col){
        curCol = col;
    }

    public void parseDirection(String dirLine) throws TreasureMapException{
        

        try(
            Scanner input = new Scanner(dirLine)
        ){
            String direction = input.next();
            int offset = input.nextInt();
        
       
            switch (direction){
                case "north":
                   
                    for (int i = 0; i <= offset; i++){
                        super.setPos(curRow - i, curCol, '.');
                        
                    }
                    setCurRow(curRow - offset);

                    break;
                case "south":
                    for (int i = 0; i <= offset; i++){
                        super.setPos(curRow + i, curCol, '.');
                        
                    }
                    setCurRow(curRow + offset);
                
                    break;
                case "west":
                    for (int i = 0; i <= offset; i++){
                        super.setPos(curRow , curCol - i, '.');
                        
                    }
                    setCurCol(curCol - offset);
                    break;
                case "east":
                    for (int i = 0; i <= offset; i++){
                        super.setPos(curRow , curCol + i, '.');
                    }
                    setCurCol(curCol + offset);
                    break;
                default: 
                    throw new TreasureMapException("BAD COMMAND!");
            }       
        
        }catch (Exception e){
            throw new TreasureMapException("YE CANNOT MOVE SO!", e);
        }
        

    }

    public void loadInstructions(String filename) throws TreasureMapException{
        //catching instantly
        try(
            Scanner input = new Scanner(new File(filename))
        ){  
            
            while(input.hasNextLine()){
                parseDirection(input.nextLine());
                
            }

            setPos(getCurRow(), getCurCol(), 'X');
        
        }catch(Exception e){
            //clear();
            //throw new TreasureMapException("YE CANNOT READ THIS MAP!", e);

        }

    }

    public void saveMap(String filename) throws TreasureMapException{
        try(
            PrintWriter output = new PrintWriter(filename)
        ){
            output.print(getMapString());
        }
        catch (Exception e){
            throw new TreasureMapException("SUCH TREASURE NEEDS BE SECRET!", e);
        }


    }


}
