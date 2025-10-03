public class Student extends Character {
    
    private boolean hidden;

    public Student (String name, int energyLevel, int skillLevel) {
        super(name,energyLevel,skillLevel);
        this.hidden = false;
    }

    public void hide () {
        this.hidden = true;
    }

    public int hurt (int attackAmount) {
        
        if (this.hidden == false) {
            this.reduceEnergyLevel(attackAmount);
            return attackAmount;
        }

        this.hidden = false;
        return 0;
    }

}