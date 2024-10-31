package edu.westga.cs3211.zodiac_animals.test.snake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Snake;

class TestConstructor {

	@Test
    public void testConstructorValid() {
        Snake snake = new Snake("Python", "Green", 3.5);
        assertEquals("Python", snake.getName());
        assertEquals("Green", snake.getColor());
        assertEquals(3.5, snake.getLength(), 0.001);
    }

    @Test
    public void testConstructorZeroLength() {
        Snake snake = new Snake("Cobra", "Black", 0.0);
        assertEquals("Cobra", snake.getName());
        assertEquals("Black", snake.getColor());
        assertEquals(0.0, snake.getLength(), 0.001);
    }

    @Test
    public void testConstructorNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Snake("Viper", "Red", -1.0);
        });
    }

    @Test
    public void testConstructorNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Snake(null, "Yellow", 1.0);
        });
    }

    @Test
    public void testConstructorEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Snake("", "Yellow", 1.0);
        });
    }

    @Test
    public void testConstructorNullColor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Snake("Boa", null, 1.0);
        });
    }

    @Test
    public void testConstructorEmptyColor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Snake("Boa", "", 1.0);
        });
    }

}
