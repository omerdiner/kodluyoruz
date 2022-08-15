package PatikaStore;

import java.util.ArrayList;

public class Phone extends Product {
    private static ArrayList<Phone> phones = new ArrayList<>();
    private static int uniqueId = 5001;
    private int memory;
    private int batteryPower;
    private double screenSize;
    private int ram;
    private String colour;

    public Phone(String name, Brand brand, int amount, int discountRate, int stock, int memory, int batteryPower, double screenSize, int ram, String colour) {
        super(uniqueId++, name, brand, amount, discountRate, stock);
        this.memory = memory;
        this.batteryPower = batteryPower;
        this.screenSize = screenSize;
        this.ram = ram;
        this.colour = colour;
    }

    public Phone(int memory, int batteryPower, double screenSize, int ram, String colour) {
        this.memory = memory;
        this.batteryPower = batteryPower;
        this.screenSize = screenSize;
        this.ram = ram;
        this.colour = colour;
    }

    public Phone() {

    }

    @Override
    void showProducts() {
        if (phones.size() == 0) {
            System.out.println("No products yet.");
            return;
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID   | Product Name              | Amount          | Brand           | Stock        | Discount Rate      | RAM    | Screen Size       | Memory     | Battery Power    | Colour     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone phone : phones) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    phone.getId(), phone.getName(), phone.getAmount(), phone.getBrand().getName(), phone.getAmount(),
                    phone.getDiscountRate(), phone.getRam(), phone.getScreenSize(), phone.getMemory(), phone.getBatteryPower(), phone.getColour(), phone.getScreenSize());
        }
    }

    @Override
    void deleteProduct() {
        showProducts();
        System.out.print("ID number of the phone to be deleted:");
        int idNo = scanner.nextInt();
        for (Phone phone : phones) {
            if (phone.getId() == idNo) {
                phones.remove(phone);
                System.out.println("Successfully deleted.");
                return;
            }
        }
        System.out.println("Invalid id.");
    }

    @Override
    void addProduct() {
        System.out.print("Product name: ");
        String productName = scanner.next();
        System.out.print("Brand: ");
        String brandName = scanner.next();
        Brand brand = Brand.getBrandByName(brandName);
        if (brand == null) {
            System.out.println("Invalid brand. Try again! ");
            return;
        }
        System.out.print("Amount: ");
        int amount = scanner.nextInt();
        System.out.print("Discount Rate: ");
        int discountRate = scanner.nextInt();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Memory: ");
        int memory = scanner.nextInt();
        System.out.print("Battery Power: ");
        int battery = scanner.nextInt();
        System.out.print("Ram: ");
        int ram = scanner.nextInt();
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("Colour: ");
        String colour = scanner.next();

        phones.add(new Phone(productName, brand, amount, discountRate, stock, memory, battery, screenSize, ram, colour));
    }


    @Override
    void filter() {
        System.out.print("Which brand do you want to see products from? :");
        String brandName = scanner.next();
        boolean isFound = false;
        for (Phone phone : phones) {
            if (phone.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.println(phone.toString());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("There is no product of this brand.");
        }
    }

    @Override
    void productOperations() {
        String menu = "1.Add Phone\n2.Delete Phone\n3.Show Phones\n4.Filter by brand";
        System.out.println(menu);
        int choice;
        do {
            System.out.print("Choice: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 4);
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                deleteProduct();
                break;
            case 3:
                showProducts();
                break;
            case 4:
                filter();
                break;
        }
    }

    public static ArrayList<Phone> getPhones() {
        return phones;
    }

    public static void setPhones(ArrayList<Phone> phones) {
        Phone.phones = phones;
    }

    public static int getUniqueId() {
        return uniqueId;
    }

    public static void setUniqueId(int uniqueId) {
        Phone.uniqueId = uniqueId;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "memory=" + memory +
                ", batteryPower=" + batteryPower +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", colour='" + colour + '\'' +
                '}';
    }
}
