public class BadGun extends Weapon {
    public BadGun (String name, int power) {
        super (name, power);
    }

    public int shoot () {
        this.changePower(Math.floor (this.getPower() * 0.8)); 
        return this.getPower();
    }
}