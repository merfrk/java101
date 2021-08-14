import java.util.Scanner;

public class Odev28 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();
        for(int i = 1; i < n; i++){
            if((n % i) == 0) sum += i;
        }
        if(n == sum) System.out.println(n+" Mükemmel sayıdır.");
        else System.out.println(n+" Mükemmel sayı değildir.");
    }
}
