import java.util.Scanner;

public class Odev35 {
    static boolean isPrime(int number,int i){
        if(number <= 2) return (number == 2) ? true : false;
        if(number % i == 0) return false;
        if(i > number / 2) return true;

        return isPrime(number,i+1);
    }
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = scan.nextInt();
        if(isPrime(number,2)) System.out.println(number+" Asaldır !");
        else System.out.println(number+" Asal değildir !");
    }
}
