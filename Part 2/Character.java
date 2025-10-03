/**
 * The Character class represents a generic character in the combat simulation.
 * Each character has a name, skill level, and energy level, and can perform attacks
 * and receive damage.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */

public class Character {

    // Private variables
    private String characterName;
    private int skillLevel;
    private int energyLevel;

    /**
     * Constructs a Character with the specified name, energy level, and skill level.
     *
     * @param name the name of the character
     * @param energyLevel the initial energy level
     * @param skillLevel the skill level used in attack calculation
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
     * @return the character's energy level
     */

    public int getEnergyLevel () {
        return this.energyLevel;
    }

    /**
     * Reduces the character's energy level by a specified amount.
     *
     * @param reduction the amount to subtract from energy level
     */

    public void reduceEnergyLevel (int reduction) {
        this.energyLevel -= reduction;
    }

    /**
     * Applies damage to the character and returns the amount of damage taken.
     *
     * @param attackAmount the amount of damage to apply
     * @return the damage taken (equal to attackAmount)
     */

    public int hurt (int attackAmount) {
        this.energyLevel -= attackAmount;
        return attackAmount;
    }

    /**
     * Calculates the total attack power by adding the character's skill level
     * to the weapon's shooting power.
     *
     * @param w1 the weapon used in the attack
     * @return the total attack power
     */

    public int attack (Weapon w1) {
        return this.skillLevel + w1.shoot();
    }

    /**
     * Determines whether the character has lost the combat.
     *
     * @return true if energy level is 0 or below, false otherwise
     */

    public boolean isLose () {
        return (this.energyLevel <= 0);
    }

}