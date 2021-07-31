import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        double armutFiyat=2.14 , elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.00,toplam;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input= new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?");
        armutKg=input.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        elmaKg=input.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        domatesKg=input.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        muzKg=input.nextInt();
        System.out.println("Patlican Kaç Kilo ?");
        patlicanKg= input.nextInt();

        toplam=armutKg*armutFiyat+elmaKg*elmaFiyat+domatesKg*domatesFiyat+muzKg*muzFiyat+patlicanKg*patlicanFiyat;
        System.out.println("Toplam Tutar = "+toplam);

    }
}
