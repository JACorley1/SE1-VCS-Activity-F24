package edu.westga.cs3211.zodiac_animals.model;

/** The Horse data class
 * 
 * @author Kate Anglin and Jacob Baker
 * @version Fall 2024
 */
public class Horse {
	
	private String name;
	private String breed;
	
	/**Horse Constructor
	 * 
	 * @param name the name of the horse
	 * @param breed the breed of the horse
	 */
	public Horse(String name, String breed) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("name cannot be null or empty");
		}
		if (breed == null || breed.isEmpty()) {
			throw new IllegalArgumentException("breed cannot be null or empty");
		}
		
		this.name = name;
		this.breed = breed;
	}

	/** Gets the horses name
	 * 
	 * @return name the name
	 */
	public String getName() {
		return name;
	}

	/** Gets the horses breed
	 * 
	 * @return breed the breed
	 */
	public String getBreed() {
		return breed;
	}
}
