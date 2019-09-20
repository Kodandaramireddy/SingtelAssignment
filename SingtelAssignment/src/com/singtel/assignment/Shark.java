package com.singtel.assignment;

public class Shark  extends Fish{
	String type;
	String size;
	String colour;
	
	Shark(String type,
	String size,
	String colour){
		
		this.type=type;
		this.size=size;
		this.colour=colour;
	  System.out.println("Printing ::" +type +"" +size+"" +colour);	
		
	}
	
	Shark(){
		
	}
    void eatOtherFish(){
    	System.out.println("eat other fish");
    }

	

}
