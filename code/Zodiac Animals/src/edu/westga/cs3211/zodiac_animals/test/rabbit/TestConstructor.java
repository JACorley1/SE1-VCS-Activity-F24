package edu.westga.cs3211.zodiac_animals.test.rabbit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Rabbit;

class TestConstructor {

	@Test
	void testNullName() {
		
		
		assertThrows(IllegalArgumentException.class, () -> new Rabbit(null, "blue"));
	}
	
	@Test
	void testNullColor() {
		
		
		assertThrows(IllegalArgumentException.class, () -> new Rabbit("Jack", null));
	}

}
