package AdventureGame.Location.Concretes;

import AdventureGame.Location.Abstracts.BattleLocation;
import AdventureGame.Obstacles.Concrete.Snake;
import AdventureGame.Player.Player;

public class Mine extends BattleLocation {
    public Mine(Player player) {
        super(player, "Mine", new Snake(), null, 5, true);
    }


}
