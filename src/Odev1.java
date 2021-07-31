import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        int math,physics,chemistry,Turkish,history,music ;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        math = input.nextInt();

        System.out.println("Fizik notunuzu giriniz :");
        physics = input.nextInt();

        System.out.println("Kimya notunuzu giriniz :");
        chemistry = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz :");
        Turkish = input.nextInt();

        System.out.println("Tarih notunuzu giriniz :");
        history = input.nextInt();

        System.out.println("Müzik notunuzu giriniz :");
        music = input.nextInt();

        int sum = (math+physics+chemistry+Turkish+history+music);
        double result = sum / 6.0 ;
        String s = result > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(s);
    }
}

