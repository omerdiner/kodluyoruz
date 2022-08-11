package AdventureGame.Location.Concretes;

import AdventureGame.Location.Abstracts.BattleLocation;
import AdventureGame.Obstacles.Concrete.Zombie;
import AdventureGame.Player.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 3, false);
    }
}
