public class SuperGun extends Weapon {
    
    private boolean boosted;

    public SuperGun (String name, int power) {
        super (name, power);
        this.boosted = false;
    }

    public void boost () {
        this.boosted = true;
    }

    public int shoot () {
        if (this.boosted == true) {
            return this.getPower() * 2;
        }
        else {
            return this.getPower();
        }
        this.boosted = false;
    }
}