package edu.westga.cs3211.zodiac_animals.test.pig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Pig;

class TestConstructor {

	@Test
	public void testValidPigConstructor() {
		Pig pig = new Pig(5, 10);
		
		assertEquals(5, pig.getAge());
		assertEquals(10, pig.getSize());
	}

	@Test
	public void testInvalidPigAge() {
		assertThrows(IllegalArgumentException.class, () -> {
            new Pig(-1, 10);
        });
	}
	
	@Test
	public void testInvalidPigSize() {
		assertThrows(IllegalArgumentException.class, () -> {
            new Pig(5, -1);
        });
	}
}
