package AdventureGame.Location.Concretes;

import AdventureGame.Location.Abstracts.BattleLocation;
import AdventureGame.Obstacles.Abstract.Obstacle;
import AdventureGame.Obstacles.Concrete.Bear;
import AdventureGame.Player.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player,"River", new Bear(), "Water",2,false);
    }
}
