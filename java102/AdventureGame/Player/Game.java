package AdventureGame.Player;

import AdventureGame.Location.Abstracts.Location;
import AdventureGame.Location.Concretes.*;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private int choice;

    public void start() {
        System.out.print("Your name: ");
        String playerName = scanner.next();
        System.out.println(playerName + " welcome to the game !");
        Player player = new Player(playerName);
        player.selectCharacter();
        System.out.println("You are playing as a " + player.getCharacterName() + " .");


        Location location = null;
        while (true) {
            player.showStats();
            Location[] locations = {new SafeHouse(player), new ToolStore(player), new Forest(player), new Cave(player), new River(player), new Mine(player)};
            System.out.println("-------PLACES------");
            System.out.println("1. Safehouse");
            System.out.println("2. Toolstore");
            System.out.println("3. Forest");
            System.out.println("4. Cave");
            System.out.println("5. River");
            System.out.println("6. Mine");
            System.out.println("0. EXIT");
            do {
                System.out.print("Your choice:");
                choice = scanner.nextInt();
            } while (choice < 0 || choice > locations.length);
            if (choice == 0) {
                System.out.println("You finished the game.");
                System.exit(0);
            }
            location = locations[choice - 1];

            if (!location.onLocation()) {
                System.out.println("You are dead!");
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
