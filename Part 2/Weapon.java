public class Weapon {
    private String weaponName;
    private int power;

    public Weapon (String name, int power) {
        this.weaponName = name;
        this.power = power;
    }
    
    public String getName () {
        return this.weaponName;
    }

    public int getPower () {
        return this.power;
    }
    
    public int shoot () {
        return this.power;
    }

    public void changePower (int target) {
        this.power = target;
    }
}