package edu.westga.cs3211.zodiac_animals.model;

import java.awt.Color;
/**
 * The monkey class
 * @author Colby and Aayush
 * @version Fall 2024
 */
public class Monkey {
	
	private String name;
	private Color color;
	
	/**
	 * Makes an instance of the monkey class
	 * @Precondition: name != null && color != null && this.name.IsEmpty() == false
	 * @Postcondition: this.name == name && this.color == color 
	 */
	
	public Monkey(String name, Color color) {
		this.setName(name);
		this.setColor(color);
	}
	
	/**
	 * Gets the color
	 * @Return the color
	 */
	public Color getColor() {
		return this.color;
	}
	
	/**
	 * Sets the color
	 * @Precondition: color != null 
	 * @Postcondition: this.color == color
	 */
	public void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("color cannot be null");
		}
		this.color = color;
	}
	
	/**
	 * Gets the name
	 * @Return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the name
	 * @Precondition: name != null && name.IsEmpty == fase
	 * @Postcondition: this.name == name
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (name.isEmpty() ) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		this.name = name;
	}
}
