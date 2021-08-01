import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        n2 = input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz :");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        select = input.nextInt();
        switch (select) {
            case 1 -> System.out.println(n1 + n2);
            case 2 -> System.out.println(n1 - n2);
            case 3 -> System.out.println(n1 * n2);
            case 4 -> System.out.println(n1 / n2);
            default -> System.out.println("Böyle bir işlem bulunmamaktadır\nLütfen belirtilen işlemlerden birini seçiniz");
        }
    }
}
