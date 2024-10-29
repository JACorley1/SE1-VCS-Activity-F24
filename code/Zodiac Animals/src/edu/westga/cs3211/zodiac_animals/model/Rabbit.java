package edu.westga.cs3211.zodiac_animals.model;

public class Rabbit {

	
	private String name; 
	
	private String color;
	
	
	public Rabbit(String name, String color) {
		
		if (name == null) {
			throw new IllegalArgumentException("must not be null");
		}
		
		if (color == null) {
			throw new IllegalArgumentException("must not be null");
		}
		
		this.color = color;
		this.name = name;
	}
}
