package PatikaStore;

import java.util.Comparator;
import java.util.TreeSet;

public class Brand {
    private static TreeSet<Brand> brands = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    private static int uniqueId = 1001;
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        brands.add(new Brand(uniqueId++, "Samsung"));
        brands.add(new Brand(uniqueId++, "Lenovo"));
        brands.add(new Brand(uniqueId++, "Apple"));
        brands.add(new Brand(uniqueId++, "Huawei"));
        brands.add(new Brand(uniqueId++, "Casper"));
        brands.add(new Brand(uniqueId++, "Asus"));
        brands.add(new Brand(uniqueId++, "HP"));
        brands.add(new Brand(uniqueId++, "Xiaomi"));
        brands.add(new Brand(uniqueId++, "Monster"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void showBrandList() {
        for (Brand brand : brands) {
            System.out.println("-" + brand.getName());
        }
    }

    public static Brand getBrandByName(String name) {
        for (Brand brand : brands) {
            if (brand.getName().equalsIgnoreCase(name)) {
                return brand;
            }
        }
        return null;
    }
}
