package AdventureGame.Others;

public class Weapons {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapons(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapons[] weapons() {
        Weapons[] weapons = {
                new Weapons("Gun", 1, 2, 15),
                new Weapons("Sword", 2, 3, 35),
                new Weapons("Rifle", 3, 7, 45)};

        return weapons;
    }

    @Override
    public String toString() {
        return "{" +

                " id=" + id +
                ", \tdamage=" + damage +
                ", \tprice=" + price +
                ",\tname='" + name + '\'' +
                '}';
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
