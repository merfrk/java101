import java.util.Scanner;

public class Odev32 {


    static void isPolindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = reverseNumber*10 + lastNumber;
            temp /= 10;
        }
        if((number % 10) == (reverseNumber % 10)) System.out.println(number + " Polindrom Sayıdır .");
        else System.out.println(number + "Polindrom Sayı değildir !");
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Polindrom olup olmadığını öğrenmek istediğiniz sayıyı giriniz : ");
        n = scan.nextInt();
        isPolindrom(n);

    }

}
