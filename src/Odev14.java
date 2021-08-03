import java.util.Scanner;

public class Odev14 {
    public static void main(String[] args) {
       int km,age,tripType;
       double ticketCost;
       Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz :");
        age = input.nextInt();
        System.out.println("Yolculuk tipinizi giriniz (1 => Tek yön , 2 => Gidiş Dönüş )");
        tripType = input.nextInt();
        if((km<0 || age<0) || (tripType !=1 && tripType !=2) ) {
            System.out.println("Hatalı veri girdiniz");
            return;
        }
        ticketCost = km * 0.10 ;
        if(age<12) ticketCost /=2;
        else if( age<=24) ticketCost -= ticketCost / 10;
        else if(age>65)  ticketCost -= ticketCost *30/100;

        if(tripType == 2) {
            ticketCost -= ticketCost * 20 / 100;
            ticketCost *= 2;
        }

        System.out.println("Toplam tutar = "+ticketCost);

    }
}
