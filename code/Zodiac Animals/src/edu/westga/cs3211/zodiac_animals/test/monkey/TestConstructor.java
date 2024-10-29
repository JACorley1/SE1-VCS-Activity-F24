package edu.westga.cs3211.zodiac_animals.test.monkey;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Monkey;

class TestConstructor {

	
	@Test
	public void testConstructorValid() {
        Monkey monkey = new Monkey("Monkey", Color.RED);
        assertEquals("Monkey", monkey.getName());
        assertEquals(Color.RED, monkey.getColor());
    }

    @Test
    public void testConstructorNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Monkey(null, Color.RED);
        });
    }

    @Test
    public void testConstructorEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Monkey("", Color.RED);
        });
    }

    @Test
    public void testConstructorNullColor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Monkey("Monkey", null);
        });
    }

   

}
