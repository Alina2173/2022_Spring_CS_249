package edu.lina1.Assign04;
//import java.util.*;

public class BusinessCard {
    //The name of the business
    private String name;
    //slogan that consist of 4 lines
    private String [] sloganLines;
    //the boundary character
    private char boundary;

    //Constructor for BusinessCard
    public BusinessCard(String name, String [] sloganLines, char boundaryChar){
        setName(name);
        setSlogan(sloganLines);
        setBoundaryChar(boundaryChar);

    }

    public String getName() {
        //returns name of business
        return name;
    }

    public char getBoundaryChar(){
        //return boundary character
        return boundary;
    }

    //return stored slogan in a single string
    public String getSlogan(){
        
        return String.join("\n", sloganLines);
        
    }

    public void setName(String name){
        //'this.name' is BusinessCard's variable vs name is the parameter
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar){
        boundary = boundaryChar;
    }

    //set slogan 
    public void setSlogan(String [] sloganLines){
        this.sloganLines = new String[4];

        //fill slogan with first 4 lines and rest as blanks
        for (int i = 0; i < 4; i++){
            if(i < sloganLines.length) {
				this.sloganLines[i] = sloganLines[i];
			}else {
				this.sloganLines[i] = "";
			}
        }
    }

    //This returns a String with Final business card 
    //does NOT print anything out
    public String toString(){
        //42 char in width
        int width = 42;

        //String for Final Business Card
        String s = new String();

        //1st row
        for (int i = 0; i < width; i++){
            s += boundary;
        }
        s += "\n";

        //format string to be 40 character long and fill blank with space
        String format = "%-"+(width-2)+"."+(width-2)+"s";

        //2nd line + name
        s += boundary + String.format(format, " " + name) + boundary + "\n";

        //3rd line, blank
        s += boundary + String.format(format, " ") + boundary + "\n";


        //4-7th lines for slogan
        for(int i = 0; i < sloganLines.length; i++) {
			s += boundary + String.format(format," "+ sloganLines[i]) + boundary + "\n";
		}

        //ending row
        for (int i = 0; i < width; i++){
            s += boundary;
        }
        s += "\n";

        return s;
    }


}
