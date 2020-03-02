package com.example.myspringapp;

public class viewer {
    private String name;
    private int ID;

    public viewer(){
    }
    
    public viewer(String word){
    System.out.println("This is: "+word);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
}
