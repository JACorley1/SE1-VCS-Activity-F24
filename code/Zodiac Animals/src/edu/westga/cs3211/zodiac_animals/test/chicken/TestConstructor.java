package edu.westga.cs3211.zodiac_animals.test.chicken;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Chicken;

public class TestConstructor {

	@Test
	public void testConstructor() {
		Chicken babyChicken = new Chicken(2, "Sam");
		
		assertEquals("Sam", babyChicken.getNameOfPerson());
		assertEquals(2, babyChicken.getAgeOfPerson());
	}
}
