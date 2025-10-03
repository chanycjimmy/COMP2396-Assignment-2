/**
 * The SecurityGuard class represents a security guard character in the office combat simulation.
 * It is a subclass of Character and has the special ability to boost a SuperGun for enhanced attacks.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */

public class SecurityGuard extends Character {
    
    /**
     * Constructs a SecurityGuard with the specified name, energy level, and skill level.
     *
     * @param name the name of the security guard
     * @param energyLevel the initial energy level of the guard
     * @param skillLevel the skill level used in attack calculation
     */
    
    public SecurityGuard (String name, int energyLevel, int skillLevel) {
        super(name,energyLevel,skillLevel);
    }

    /**
     * Boosts the specified SuperGun to double its power for the next attack.
     *
     * @param w1 the SuperGun to be boosted
     */
    
    public void boostWeapon (SuperGun w1) {
        w1.boost();
    }

}