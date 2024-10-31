package edu.westga.cs3211.zodiac_animals.model;


/** The Tiger Class
 * @author Nick Watts, JJ, Alex Klamkofth
 */
public class Tiger {
    private String name;
    private int powerLevel;

    public Tiger(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return this.name;
    }

    public int getPowerLevel() {
        return this.powerLevel;
    }
}
