/**
 * The Student class represents a student character in the office combat simulation.
 * A student is a subclass of Character and has the ability to hide from attacks.
 * 
 * @author Jimmy Chan
 * @version 1.0
 */

public class Student extends Character {

    /** Indicates whether the student is currently hidden from attacks. */
    private boolean hidden;

    /**
     * Constructs a Student with the specified name, energy level, and skill level.
     * Initially, the student is not hidden.
     *
     * @param name the name of the student
     * @param energyLevel the initial energy level of the student
     * @param skillLevel the skill level used in attack calculation
     */
    
    public Student (String name, int energyLevel, int skillLevel) {
        super(name,energyLevel,skillLevel);
        this.hidden = false;
    }

    /**
     * Activates the student's hiding ability, allowing them to dodge the next attack.
     */

    public void hide () {
        this.hidden = true;
    }

    /**
     * Applies damage to the student unless they are hidden.
     * If hidden, the student avoids the attack and takes no damage.
     * The hiding status is reset after the attack attempt.
     *
     * @param attackAmount the amount of damage to apply
     * @return the actual damage taken (0 if hidden, otherwise attackAmount)
     */

    @Override
    
    public int hurt (int attackAmount) {
        
        if (this.hidden == false) {
            this.reduceEnergyLevel(attackAmount);
            return attackAmount;
        }

        this.hidden = false;
        return 0;
    }

}