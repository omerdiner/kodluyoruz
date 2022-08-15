package PatikaStore;

import java.util.ArrayList;

public class Notebook extends Product {
    private static ArrayList<Notebook> notebooks = new ArrayList<>();
    private static int uniqueId = 7001;
    private int memory;
    private double screenSize;
    private int ram;

    public Notebook(String name, Brand brand, int amount, int discountRate, int stock, int memory, double screenSize, int ram) {
        super(uniqueId++, name, brand, amount, discountRate, stock);
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Notebook(int memory, double screenSize, int ram) {
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Notebook() {

    }

    @Override
    void showProducts() {
        if (notebooks.size() == 0) {
            System.out.println("No products yet.");
            return;
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID   | Product Name              | Amount          | Brand           | Stock        | Discount Rate      | RAM    | Screen Size       | Memory     |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook notebook : notebooks) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    notebook.getId(), notebook.getName(), notebook.getAmount(), notebook.getBrand().getName(), notebook.getAmount(),
                    notebook.getDiscountRate(), notebook.getRam(), notebook.getScreenSize(), notebook.getMemory());
        }
    }

    @Override
    void deleteProduct() {
        showProducts();
        System.out.print("ID number of the notebook to be deleted:");
        int idNo = scanner.nextInt();
        for (Notebook notebook : notebooks) {
            if (notebook.getId() == idNo) {
                notebooks.remove(notebook);
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
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("Ram: ");
        int ram = scanner.nextInt();


        notebooks.add(new Notebook(productName, brand, amount, discountRate, stock, memory, screenSize, ram));

    }

    @Override
    void filter() {
        System.out.print("Which brand do you want to see products from? :");
        String brandName = scanner.next();
        boolean isFound = false;
        for (Notebook notebook : notebooks) {
            if (notebook.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.println(notebook.toString());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("There is no product of this brand.");
        }
    }

    @Override
    void productOperations() {
        String menu = "1.Add Notebook\n2.Delete Notebook\n3.Show Notebooks\n4.Filter by brand";
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

    public static ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public static void setNotebooks(ArrayList<Notebook> notebooks) {
        Notebook.notebooks = notebooks;
    }

    public static int getUniqueId() {
        return uniqueId;
    }

    public static void setUniqueId(int uniqueId) {
        Notebook.uniqueId = uniqueId;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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

    @Override
    public String toString() {
        return super.toString() + " {" +
                "memory=" + memory +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                '}';
    }
}
