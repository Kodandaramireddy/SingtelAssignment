package com.singtel.assignment;

public class Clownfish  extends Fish{
	String type;
	String size;
	String colour;
	
	Clownfish(String type,
	String size,
	String colour){
		
		this.type=type;
		this.size=size;
		this.colour=colour;
	  System.out.println("Printing ::" +type +"" +size+"" +colour);	
		
	}
	
	 void makesJokes(){
	    	System.out.println("Makes Jokes");
	    }
	 Clownfish(){
		 
	 }
}
