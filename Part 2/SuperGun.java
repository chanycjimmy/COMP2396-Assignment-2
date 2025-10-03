/**
 * The SuperGun class represents a high-powered weapon in a combat simulation.
 * It is a subclass of Weapon and has the ability to be boosted for a more powerful attack.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */

public class SuperGun extends Weapon {
    
    // Private variable
    private boolean boosted;

    /**
     * Constructs a SuperGun with the specified name and power level.
     * Initially, the gun is not boosted.
     *
     * @param name the name of the weapon
     * @param power the base power level of the weapon
     */

    public SuperGun (String name, int power) {
        super (name, power);
        this.boosted = false;
    }
    
    /**
     * Boosts the gun so that the next shot will have double the power.
     */

    public void boost () {
        this.boosted = true;
    }

    /**
     * Fires the gun. If the gun is boosted, it returns double the power and resets the boost.
     * Otherwise, it returns the normal power level.
     *
     * @return the power of the shot, either normal or boosted
     */
    @Override
    
    public int shoot () {
        if (this.boosted == true) {
            this.boosted = false;
            return this.getPower() * 2;
        }
        else {
            return this.getPower();
        }
    }
}