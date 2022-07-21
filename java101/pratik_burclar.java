import java.util.Scanner;

public class pratik_burclar {
    public static void main(String[] args) {
        int month, day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month ?:");
        month = scanner.nextInt();
        System.out.print("Which day?:");
        day = scanner.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.print("Capricorn");
                } else {
                    System.out.print("Aquarius");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    System.out.print("Aquarius");
                } else {
                    System.out.print("Pisces");
                }
            } else {
                System.out.print("Invalid date");
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.print("Pisces");
                } else {
                    System.out.print("Aries");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    System.out.print("Aries");
                } else {
                    System.out.print("Taurus");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.print("Taurus");
                } else {
                    System.out.print("Gemini");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.print("Gemini");
                } else {
                    System.out.print("Cancer");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Cancer");
                } else {
                    System.out.print("Leo");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Leo");
                } else {
                    System.out.print("Virgo");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.print("Virgo");
                } else {
                    System.out.print("Libra");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Libra");
                } else {
                    System.out.print("Scorpio");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.print("Scorpio");
                } else {
                    System.out.print("Sagittarius");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.print("Sagittarius");
                } else {
                    System.out.print("Capricorn");
                }
            } else {
                System.out.print("Invalid date.");
            }
        }
    }
}
