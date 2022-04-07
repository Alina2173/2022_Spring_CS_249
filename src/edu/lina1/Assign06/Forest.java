package edu.lina1.Assign06;
import java.util.*;


public class Forest {

    private ArrayList<Giant> names = new ArrayList<>();

    public Giant createGiant(String name, String typeName){

        if (name.equals("")){
            return null;
        }
        else if(typeName.equals("GIANT")){
            return new Giant(name);
        }
        else if (typeName.equals("TROLL")){
            return new Troll(name);
        }
        else if (typeName.equals("TREE")){
            return new Tree(name);
        }
        else if (typeName.equals("ENT")){
            return new Ent(name);     
        }
        else if (typeName.equals("HUORN")){
            return new Huorn(name);
        }
        else{
            return null;
        }
    }

    public boolean addGiant(String name, String typeName){
        Giant obj = createGiant(name, typeName);

        if (obj != null){
            names.add(obj);
            return true;
        }
        else{
            return false;
        }
    }

    public Giant getGiant(int index){
        if(index >= 0 && index < names.size()){
            return names.get(index);
        }
        else{
            return null;
        }
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        
        for(Giant x: names){
            System.out.println("- " + x.toString());
        }
       
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        
        for(Giant x : names){
            if(x instanceof Tree){
            System.out.println("- " + x.toString() + ": " + ((Tree)x).speak());
            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");

        for (Giant x : names){
            if(x instanceof Troll){
            
            System.out.println("- " + x.toString() + ": " + ((Troll)x).cook());
            }
        }
        
    }



}