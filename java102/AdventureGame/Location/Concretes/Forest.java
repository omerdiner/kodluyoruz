package AdventureGame.Location.Concretes;

import AdventureGame.Location.Abstracts.BattleLocation;
import AdventureGame.Obstacles.Concrete.Vampire;
import AdventureGame.Player.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 3, false);
    }
}
