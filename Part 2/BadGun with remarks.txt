public class BadGun extends Weapon {
    public BadGun (String name, int power) {
        super (name, power);
    }

    public int shoot () {      
        /* 
        (int) is to tell the compiler that This tells the compiler: 
        "Yes, I know this is a double, and I want to convert it to int."
        */
        return (int) Math.floor (this.getPower() * 0.8);
    }
}