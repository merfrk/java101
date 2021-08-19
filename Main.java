public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Khabib" , 20 , 85, 90, 35);
        Fighter alex = new Fighter("Alex" , 15 , 95, 100, 25);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();

    }
}
