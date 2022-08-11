package AdventureGame.Obstacles.Concrete;

import AdventureGame.Obstacles.Abstract.Obstacle;

public class Snake extends Obstacle {
    public Snake() {
        super(4, 12, (int) ((Math.random() * 3) + 3), "Snake", 0);
    }
}
