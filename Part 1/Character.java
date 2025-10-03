/**
 * The Character class represents a game character in a combat simulation.
 * Each character has a name, skill level, and energy level.
 * Characters can attack using weapons and receive damage during combat.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */ 

public class Character {

    // Private fields
    private String characterName;
    private int skillLevel;
    private int energyLevel;
    
    /**
     * Constructs a Character with the specified name, energy level, and skill level.
     *
     * @param name        the name of the character
     * @param energyLevel the initial energy level of the character
     * @param skillLevel  the skill level of the character
     */

    public Character(String name, int energyLevel, int skillLevel) {
        this.characterName = name;
        this.skillLevel = skillLevel;
        this.energyLevel = energyLevel;

    }

    /**
     * Returns the name of the character.
     *
     * @return the character's name
     */
    

    public String getName () {
        return this.characterName;
    }

    /**
     * Returns the skill level of the character.
     *
     * @return the character's skill level
     */

    public int getSkillLevel() {
        return this.skillLevel;

    }

    /**
     * Returns the current energy level of the character.
     *
     * @return the character's remaining energy level
     */

    public int getEnergyLevel () {
        return this.energyLevel;
    }

    /**
     * Reduces the character's energy level by the specified attack amount.
     *
     * @param attackAmount the amount of damage taken
     * @return the amount of energy reduced
     */

    public int hurt (int attackAmount) {
        this.energyLevel -= attackAmount;
        return attackAmount;
    }

    /**
     * Calculates the total attack power of the character using the given weapon.
     * The attack power is the sum of the character's skill level and the weapon's power.
     *
     * @param w1 the weapon used for the attack
     * @return the total attack power
     */

    public int attack (Weapon w1) {
        return this.skillLevel + w1.shoot();
    }

    /**
     * Determines whether the character has lost the combat.
     * A character loses when their energy level is zero or below.
     *
     * @return true if the character has lost, false otherwise
     */

    public boolean isLose () {
        return (this.energyLevel <= 0);
    }

}