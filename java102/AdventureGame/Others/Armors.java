package AdventureGame.Others;

public class Armors {
    private int id;
    private String armorName;
    private int block;
    private int price;

    public Armors(int id, String armorName, int block, int price) {
        this.id = id;
        this.armorName = armorName;
        this.block = block;
        this.price = price;
    }

    public static Armors[] armors() {
        Armors[] armors = {
                new Armors(1, "Light", 1, 15),
                new Armors(2, "Middle", 3, 25),
                new Armors(3, "Heavy", 5, 40)};

        return armors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", \tblock=" + block +
                ", \tprice=" + price +
                ", \tarmorName='" + armorName + '\'' +
                '}';
    }
}
