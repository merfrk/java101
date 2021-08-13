import java.util.Scanner;

public class Odev21 {
    public static void main(String[] args) {
        int n,k,total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz");
        n = scan.nextInt();
        System.out.println("Üs olacak sayıyı giriniz");
        k = scan.nextInt();

        for(int i = 1; i<=k; i++){
            total *= n;
        }
        System.out.println(n +" üzeri "+k +" = "+total);
    }
}
