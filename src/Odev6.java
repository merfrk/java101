import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        double boy,vke,kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz :");
        boy=input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz :");
        kilo=input.nextDouble();
        vke=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz = "+vke);

    }
}
