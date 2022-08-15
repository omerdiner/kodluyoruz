package PatikaStore;

import java.util.Scanner;

public abstract class Product {
    private int id;
    private String name;
    private Brand brand;
    private int amount;
    private int discountRate;
    private int stock;
    public static Scanner scanner = new Scanner(System.in);

    public Product(int id, String name, Brand brand, int amount, int discountRate, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.amount = amount;
        this.discountRate = discountRate;
        this.stock = stock;
    }

    public Product() {

    }


    abstract void showProducts();

    abstract void deleteProduct();

    abstract void addProduct();

    abstract void filter();

    abstract void productOperations();

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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand.getName() +
                ", amount=" + amount +
                ", discountRate=" + discountRate +
                ", stock=" + stock +
                '}';
    }
}
