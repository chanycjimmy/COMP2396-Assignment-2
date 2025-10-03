public class SecurityGuard extends Character {
    
    public SecurityGuard (String name, int energyLevel, int skillLevel) {
        super(name,energyLevel,skillLevel);
    }

    public void boostWeapon (SuperGun w1) {
        w1.boost();
    }

}