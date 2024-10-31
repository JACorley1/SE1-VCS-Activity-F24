package edu.westga.cs3211.zodiac_animals.test.horse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Horse;

class TestCosntructor {

	@Test
	public void testConstructorValid() {
        Horse horse = new Horse("Erebos", "Quarter Horse");
        assertEquals("Erebos", horse.getName());
        assertEquals("Quarter Horse", horse.getBreed());
    }

    @Test
    public void testConstructorNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse(null, "Quarter Horse");
        });
    }

    @Test
    public void testConstructorEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse("", "Quarter Horse");
        });
    }

    @Test
    public void testConstructorNullBreed() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse("Erebos", null);
        });
    }

    @Test
    public void testConstructorEmptyBreed() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse("Erebos", "");
        });
    }

}
