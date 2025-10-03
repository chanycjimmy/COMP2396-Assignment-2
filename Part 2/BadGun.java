/**
 * The BadGun class represents a low-quality weapon in the office combat simulation.
 * It is a subclass of Weapon and produces reduced power with each shot.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */

public class BadGun extends Weapon {

    /**
     * Constructs a BadGun with the specified name and power level.
     *
     * @param name the name of the weapon
     * @param power the base power level of the weapon
     */
    
    public BadGun (String name, int power) {
        super (name, power);
    }
    
    /**
     * Fires the gun, producing only 80% of its original power.
     * The result is rounded down to the nearest integer.
     *
     * @return the reduced power of the shot
     */
    @Override
    public int shoot () {      
        return (int) Math.floor (this.getPower() * 0.8);
    }
}