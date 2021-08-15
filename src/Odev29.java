import java.util.Scanner;

public class Odev29 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();
            for(int i = n; i>=1; i--){
                for(int j = 0; j <= n-i; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= 2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}
