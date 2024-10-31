package edu.westga.cs3211.zodiac_animals.model;

/**
 * Represents a Snake
 * 
 * @author ne00040
 * @version Fall 2024
 */
public class Snake {
	private String name;
	private String color;
	private double length;

	/**
	 * Constructs a Snake with the type, specified color and length.
	 *
	 * @param name   the name of the snake
	 * @param color  the color of the snake
	 * @param length the length of the snake in meters; must be non-negative
	 * @throws IllegalArgumentException if length is negative
	 */
	public Snake(String name, String color, double length) {
		if (length < 0) {
			throw new IllegalArgumentException("Length must be non-negative");
		}

		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("name cannot be null or empty");
		}

		if (color == null || color.isBlank()) {
			throw new IllegalArgumentException("color cannot be null or empty");
		}
		this.name = name;
		this.color = color;
		this.length = length;
	}

	/**
	 * Returns the name of the snake.
	 *
	 * @return the name of the snake
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the color of the snake.
	 *
	 * @return the color of the snake
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Returns the length of the snake.
	 *
	 * @return the length of the snake in meters
	 */
	public double getLength() {
		return this.length;
	}
}
