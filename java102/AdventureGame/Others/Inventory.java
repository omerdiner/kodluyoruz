package AdventureGame.Others;

public class Inventory {
    private Weapons weapon;
    private Armors armor;

    public Inventory() {
        weapon = new Weapons("Fist", 0, 0, 0);
        armor = new Armors(0, "None", 0, 0);
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Armors getArmor() {
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
}
