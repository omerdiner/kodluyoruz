package AdventureGame.Obstacles.Abstract;

public abstract class Obstacle {
    private int id;
    private int health;
    private int damage;
    private String name;
    private int coin;
    public static int maxHealth;


    public Obstacle(int id, int health, int damage, String name, int coin) {
        this.id = id;
        this.health = health;
        this.damage = damage;
        this.name = name;
        this.coin = coin;
        maxHealth = health;

    }

    public void showStats() {
        System.out.println(this.toString());
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + "{" +
                " health=" + health +
                ", damage=" + damage +
                ", coins=" + coin +
                " }";
    }
}
