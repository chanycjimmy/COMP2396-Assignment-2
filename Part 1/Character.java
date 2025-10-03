public class Character {

    private String characterName;
    private int skillLevel;
    private int energyLevel;

    public Character(String name, int energyLevel, int skillLevel) {
        this.characterName = name;
        this.skillLevel = skillLevel;
        this.energyLevel = energyLevel;

    }

    public String getName () {
        return this.characterName;
    }

    public int getSkillLevel() {
        return this.skillLevel;

    }

    public int getEnergyLevel () {
        return this.energyLevel;
    }

    public int hurt (int attackAmount) {
        this.energyLevel -= attackAmount;
        return attackAmount;
    }

    public int attack (Weapon w1) {
        return this.skillLevel + w1.shoot();
    }

    public boolean isLose () {
        return (this.energyLevel <= 0);
    }

}