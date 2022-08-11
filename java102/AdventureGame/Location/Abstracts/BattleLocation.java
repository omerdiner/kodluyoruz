package AdventureGame.Location.Abstracts;

import AdventureGame.Obstacles.Abstract.Obstacle;
import AdventureGame.Others.Armors;
import AdventureGame.Others.Weapons;
import AdventureGame.Player.Player;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacleNumber;
    private int obstacleCount;
    private boolean hasAnAward;

    public BattleLocation(Player player, String locationName, Obstacle obstacle, String award, int maxObstacleNumber, boolean hasAnAward) {
        super(player, locationName);
        this.award = award;
        this.obstacle = obstacle;
        this.maxObstacleNumber = maxObstacleNumber;
        this.hasAnAward = hasAnAward;

    }

    public int generateRandomNumberForObstacleCount() {
        Random random = new Random();
        int obstacleCount = random.nextInt(getMaxObstacleNumber()) + 1;
        return obstacleCount;
    }

    public int getMaxObstacleNumber() {
        return maxObstacleNumber;
    }

    public void setMaxObstacleNumber(int maxObstacleNumber) {
        this.maxObstacleNumber = maxObstacleNumber;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        this.obstacleCount = generateRandomNumberForObstacleCount();
        System.out.println("There are " + obstacleCount + " " + obstacle.getName() + "s here.");
        System.out.print("Type \"fight\" if you want to kill them! :");
        String userInput = scanner.next();
        if (userInput.toLowerCase().equals("fight")) {
            return fight();
        } else {
            System.out.println("You left the battlefield.");
        }
        return true;
    }

    public boolean fight() {
        int i;
        int rand = (int) Math.round(Math.random());
        if (rand == 0) {
            for (i = 0; i < obstacleCount; i++) {
                this.obstacle.setHealth(Obstacle.maxHealth);
                System.out.print("\n-------Your character----------");
                this.getPlayer().showStats();
                System.out.println("----------Enemy-----------");
                this.getObstacle().showStats();
                System.out.println();
                System.out.println("You caught the enemy off guard and made the first hit.");
                while (getPlayer().getHealth() > 0 && getObstacle().getHealth() > 0) {
                    obstacle.setHealth(Math.max((obstacle.getHealth() - getPlayer().getTotalDamage()), 0));
                    System.out.print("Player hit: ");
                    showStatsAfterOneRound();
                    if (obstacle.getHealth() > 0) {
                        int obstacleTotalDamage = obstacle.getDamage() - getPlayer().getInventory().getArmor().getBlock();
                        obstacleTotalDamage = Math.max(obstacleTotalDamage, 0);
                        getPlayer().setHealth(Math.max((getPlayer().getHealth() - obstacleTotalDamage), 0));
                        System.out.print("Enemy hit:  ");
                        showStatsAfterOneRound();
                    } else {
                        System.out.println("You killed an " + obstacle.getName() + ".");
                        Player.totalEnemyKills++;
                        if (hasAnAward) {
                            randomItemAward();
                        }
                        getPlayer().setMoney(getPlayer().getMoney() + obstacle.getCoin());
                    }

                    if (getPlayer().getHealth() == 0) {
                        return false;
                    }
                }
                if (i != obstacleCount - 1) {
                    System.out.print("Still " + (obstacleCount - i - 1) + " enemy. Want to continue fight? (Yes/No):");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("no")) {
                        System.out.println("You left the battlefield.");
                        return true;
                    }
                }

            }
            System.out.println("You have destroyed all monsters in this area.");
            if (this.getAward() != null && !Player.collectedAwards.contains(this.getAward())) {
                System.out.println("Now , you have enemy's " + this.getAward() + ".");
                Player.collectedAwards.add(this.getAward());
            }
            return true;
        } else {
            for (i = 0; i < obstacleCount; i++) {
                this.obstacle.setHealth(Obstacle.maxHealth);
                System.out.print("\n-------Your character----------");
                this.getPlayer().showStats();
                System.out.println("----------Enemy-----------");
                this.getObstacle().showStats();
                System.out.println();
                System.out.println("The enemy acts faster than you.");
                while (getPlayer().getHealth() > 0 && getObstacle().getHealth() > 0) {
                    int obstacleTotalDamage = obstacle.getDamage() - getPlayer().getInventory().getArmor().getBlock();
                    obstacleTotalDamage = Math.max(obstacleTotalDamage, 0);
                    getPlayer().setHealth(Math.max((getPlayer().getHealth() - obstacleTotalDamage), 0));
                    System.out.print("Enemy hit:  ");
                    showStatsAfterOneRound();

                    if (getPlayer().getHealth() > 0) {
                        obstacle.setHealth(Math.max((obstacle.getHealth() - getPlayer().getTotalDamage()), 0));
                        System.out.print("Player hit: ");
                        showStatsAfterOneRound();
                    } else {
                        return false;
                    }

                }
                System.out.println("You killed an " + obstacle.getName() + ".");
                getPlayer().setMoney(getPlayer().getMoney() + obstacle.getCoin());
                Player.totalEnemyKills++;
                if (hasAnAward) {
                    randomItemAward();
                }
                if (i != obstacleCount - 1) {
                    System.out.print("Still " + (obstacleCount - i - 1) + " enemy. Want to continue fight? (Yes/No):");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("no")) {
                        System.out.println("You left the battlefield.");
                        return true;
                    }
                }

            }
            System.out.println("You have destroyed all monsters in this area.");
            if (this.getAward() != null && !Player.collectedAwards.contains(this.getAward())) {
                System.out.println("Now , you have enemy's " + this.getAward() + ".");
                Player.collectedAwards.add(this.getAward());
            }
            return true;
        }

    }

    protected void showStatsAfterOneRound() {
        System.out.print("|Your health: " + getPlayer().getHealth() + "| ");
        System.out.print(" <-->  |Enemy health: " + getObstacle().getHealth() + "|\n");
    }

    private void randomItemAward() {
        int random = (int) (Math.random() * 99) + 1;
        if (random < 16) {
            randomArmor();
        } else if (random < 31) {
            randomWeapon();
        } else if (random < 56) {
            randomCoin();
        } else {
            System.out.println("No item dropped from this snake.");
        }

    }

    private void randomCoin() {
        int random = (int) (Math.random() * 99) + 1;
        if (random < 21) {
            System.out.println("You won 1 extra coin.");
            getPlayer().setMoney(getPlayer().getMoney() + 10);
        } else if (random < 51) {
            System.out.println("You won 5 extra coins.");
            getPlayer().setMoney(getPlayer().getMoney() + 5);
        } else {
            System.out.println("You won 10 extra coins.");
            getPlayer().setMoney(getPlayer().getMoney() + 1);
        }
    }

    private void randomWeapon() {
        String answer;
        int random = (int) (Math.random() * 99) + 1;
        if (random < 21) {
            System.out.print("Rifle on the ground. would you like to take it (y/n) :");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                getPlayer().getInventory().setWeapon(Weapons.weapons()[2]);
                System.out.println("Now you have " + Weapons.weapons()[2] + ".");
            }
        } else if (random < 51) {
            System.out.print("Sword on the ground. would you like to take it (y/n) :");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                getPlayer().getInventory().setWeapon(Weapons.weapons()[1]);
                System.out.println("Now you have " + Weapons.weapons()[1] + ".");
            }
        } else {
            System.out.print("Gun on the ground. would you like to take it (y/n) :");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                getPlayer().getInventory().setWeapon(Weapons.weapons()[0]);
                System.out.println("Now you have " + Weapons.weapons()[0] + ".");
            }
        }
    }

    private void randomArmor() {
        String answer;
        int random = (int) (Math.random() * 99) + 1;
        if (random < 21) {
            System.out.print("Heavy armor on the ground. Would you like to take it (y/n) :");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                getPlayer().getInventory().setArmor(Armors.armors()[2]);
                System.out.println("Now you have " + Armors.armors()[2] + ".");
            }
        } else if (random < 51) {
            System.out.print("Medium armor on the ground. Would you like to take it (y/n) :");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                getPlayer().getInventory().setArmor(Armors.armors()[1]);
                System.out.println("Now you have " + Armors.armors()[1] + ".");
            }
        } else {
            System.out.print("Light armor on the ground. Would you like to take it (y/n) :");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                getPlayer().getInventory().setArmor(Armors.armors()[0]);
                System.out.println("Now you have " + Armors.armors()[0] + ".");
            }
        }
    }
}
