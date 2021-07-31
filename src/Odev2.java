import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        double fiyat,kdv ,fiyat2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir fiyat giriniz .");
        fiyat = input.nextDouble();
        if(fiyat <= 1000 && fiyat > 0){
            kdv = 0.18;
        }
        else if(fiyat > 1000){
            kdv = 0.08;
        }
        else{
            System.out.println("Lütfen doğru bir fiyat giriniz");
            fiyat=0;
            kdv=0;
        }
        fiyat2=fiyat;
        fiyat2 += fiyat * kdv;
        System.out.println("--------------");
        System.out.println("KDV'siz fiyat = " +fiyat );
        System.out.println("--------------");
        System.out.println("KDV'li fiyat = "+fiyat2 );
        System.out.println("--------------");
        System.out.println("KDV tutarı = "+(fiyat2-fiyat));
    }
}
