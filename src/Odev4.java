import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        double total,perKm = 2.20,startCost = 10;
        int km;
        System.out.println("Km bilgisini giriniz");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        total = (km*perKm);
        total += startCost;

        total=(total<20) ? 20 :total;
        System.out.println("Toplam tutar : "+total);

    }
}
