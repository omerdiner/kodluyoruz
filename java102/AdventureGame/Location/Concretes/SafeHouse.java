package AdventureGame.Location.Concretes;

import AdventureGame.Location.Abstracts.NormalLocation;
import AdventureGame.Player.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at safe house . Your health is fulled.");

        getPlayer().setHealth(Player.defaultPlayerHealth);
        if (Player.collectedAwards.size() == 3) {
            System.out.println("You have collected all the items to be collected.");
            System.out.println("Total kills: " + Player.totalEnemyKills);
            System.out.println("You have successfully completed the game !");
            System.exit(0);
        }
        return true;
    }
}




