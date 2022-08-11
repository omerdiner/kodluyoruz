package AdventureGame.Player;

import AdventureGame.Characters.Abstracts.GameCharacter;
import AdventureGame.Characters.Concretes.Archer;
import AdventureGame.Characters.Concretes.Knight;
import AdventureGame.Characters.Concretes.Samurai;
import AdventureGame.Others.Inventory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Player {
    private Inventory inventory;
    private String playerName;
    private String characterName;
    private int money;
    private int damage;
    private int health;
    private int choice;
    private Scanner scanner = new Scanner(System.in);
    public static int defaultPlayerHealth;
    public static Set<String> collectedAwards = new HashSet<>();
    public static int totalEnemyKills = 0;

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {
        System.out.println("First , choose a character .");

        GameCharacter[] characters = {new Archer(), new Knight(), new Samurai()};
        System.out.println("----------------------------");
        for (GameCharacter gameCharacter : characters) {
            System.out.println(gameCharacter.toString());
        }
        System.out.println("----------------------------");

        do {
            System.out.print("Your choice:");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > characters.length);

        GameCharacter gameCharacter = characters[choice - 1];
        initializePlayer(gameCharacter);
        // System.out.println(this.toString());


    }


    public void initializePlayer(GameCharacter character) {
        setDamage(character.getDamage());
        setHealth(character.getHealth());
        setMoney(character.getMoney());
        setCharacterName(character.getName());
        defaultPlayerHealth = character.getHealth();
    }


    public String getPlayerName() {
        return playerName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getTotalDamage() {
        return damage + getInventory().getWeapon().getDamage();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showStats() {
        System.out.println("\nMoney=" + getMoney() +
                "\t\tDamage=" + getTotalDamage() +
                "\t\tHealth=" + getHealth() + "\t\tWeapon=" + getInventory().getWeapon().getName()
                + "\t\tArmor=" + getInventory().getArmor().getArmorName() +
                "\t\tBlock=" + getInventory().getArmor().getBlock());
    }

    @Override
    public String toString() {
        return "\n-------------Current player info-------------\n{" +
                "playerName='" + playerName + '\'' +
                ", characterName='" + characterName + '\'' +
                ", money=" + getMoney() +
                ", damage=" + getDamage() +
                ", health=" + getHealth() +
                "}\n";
    }
}
