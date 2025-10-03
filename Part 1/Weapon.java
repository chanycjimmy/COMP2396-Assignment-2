/**
 * The Weapon class represents a weapon used in a combat simulation.
 * Each weapon has a name and a power level that determines its attack strength.
 * Weapons can be used by characters to generate damage during combat.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */


public class Weapon {

    // Private fields    
    private String weaponName;
    private int power;

    /**
     * Constructs a Weapon with the specified name and power level.
     *
     * @param name  the name of the weapon
     * @param power the power level of the weapon
     */

    public Weapon (String name, int power) {
        this.weaponName = name;
        this.power = power;
    }

    /**
     * Returns the name of the weapon.
     *
     * @return the weapon's name
     */

    public String getName () {
        return this.weaponName;
    }

    /**
     * Generates the attack power when the weapon is used.
     *
     * @return the weapon's power level
     */

    public int shoot () {
        return this.power;
    }
}