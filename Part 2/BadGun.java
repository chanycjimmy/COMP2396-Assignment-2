public class BadGun extends Weapon {
    public BadGun (String name, int power) {
        super (name, power);
    }

    public int shoot () {
        this.power = Math.floor (this.power * 0.8); 
    }
}