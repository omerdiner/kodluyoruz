package AdventureGame.Location.Concretes;

import AdventureGame.Location.Abstracts.NormalLocation;
import AdventureGame.Others.Armors;
import AdventureGame.Others.Weapons;
import AdventureGame.Player.Player;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at the store!");
        int choice;
        do {
            System.out.println("1.Weapons\n2.Armors\n0.Exit");
            choice = scanner.nextInt();
        } while (choice < 0 || choice > 2);

        switch (choice) {
            // bişey almadan çıkmayı ekle
            case 1:
                menuWeapons();
                break;
            case 2:
                menuArmors();
                break;

        }

        return true;
    }


    private void menuWeapons() {
        int weaponId;
        for (Weapons weapon : Weapons.weapons()) {
            System.out.println(weapon.toString());
        }
        do {
            System.out.print("Choose a weapon:");
            weaponId = scanner.nextInt();
        } while (weaponId < 0 || weaponId > Weapons.weapons().length);

        Weapons takenWeapon = Weapons.weapons()[weaponId - 1];

        if (takenWeapon.getPrice() > this.getPlayer().getMoney()) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println(takenWeapon.getName() + " added to inventory.");
            int currentMoney = getPlayer().getMoney() - takenWeapon.getPrice();
            this.getPlayer().setMoney(currentMoney);
            System.out.println("Current money: " + currentMoney);
            this.getPlayer().getInventory().setWeapon(takenWeapon);
            System.out.println(getPlayer().getInventory().getWeapon());
        }

    }

    private void menuArmors() {
        int armorId;
        for (Armors armor : Armors.armors()) {
            System.out.println(armor.toString());
        }
        do {
            System.out.print("Choose an armor:");
            armorId = scanner.nextInt();
        } while (armorId < 0 || armorId > Armors.armors().length);

        Armors takenArmor = Armors.armors()[armorId - 1];

        if (takenArmor.getPrice() > this.getPlayer().getMoney()) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println(takenArmor.getArmorName() + " armor added to inventory.");
            int currentMoney = getPlayer().getMoney() - takenArmor.getPrice();
            this.getPlayer().setMoney(currentMoney);
            System.out.println("Current money: " + currentMoney);
            this.getPlayer().getInventory().setArmor(takenArmor);
            System.out.println(getPlayer().getInventory().getArmor());
        }

    }
}
