public class Boks_main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 10, 100, 90, 33);
        Fighter alex = new Fighter("Alex", 11, 100, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
