package edu.westga.cs3211.zodiac_animals.test.tiger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Tiger;

class TestTiger {


    @Test
    public void testConstructorShouldInitializeNameAndPowerLevel() {
        String expectedName = "Sigma Tiger";
        int expectedPowerLevel = 100;

        Tiger tiger = new Tiger(expectedName, expectedPowerLevel);

        assertEquals(expectedName, tiger.getName(), "Constructor should initialize the name correctly.");
        assertEquals(expectedPowerLevel, tiger.getPowerLevel(), "Constructor should initialize the power level correctly.");
    }

    @Test
    public void testConstructorWithNullName() {
        String expectedName = null;
        int expectedPowerLevel = 50;

        Tiger tiger = new Tiger(expectedName, expectedPowerLevel);

        assertNull(tiger.getName(), "Constructor should allow name to be null.");
        assertEquals(expectedPowerLevel, tiger.getPowerLevel(), "Constructor should initialize the power level correctly.");
    }

    @Test
    public void testConstructorWithNegativePowerLevel() {
        String expectedName = "Negative Power Tiger";
        int expectedPowerLevel = -10;

        Tiger tiger = new Tiger(expectedName, expectedPowerLevel);

        assertEquals(expectedName, tiger.getName(), "Constructor should initialize the name correctly.");
        assertEquals(expectedPowerLevel, tiger.getPowerLevel(), "Constructor should allow negative power level.");
    }

}
