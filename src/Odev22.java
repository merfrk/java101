import java.util.Scanner;

public class Odev22 {
    public static void main(String[] args) {
        int number, tempNumber, basNumber = 0, result = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayılarını toplamak istediğiniz sayıyı giriniz : ");
        number = input.nextInt();
        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        System.out.println(tempNumber);

        for(int i=1 ;i<=basNumber ;i++){
            result += tempNumber % 10 ;
             tempNumber /= 10;
        }
        System.out.println("Sonuç = "+result);










    }
}
