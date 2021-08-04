import java.util.Scanner;

public class Odev19 {
    public static void main(String[] args) {
        int k, j=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        k = scan.nextInt();
        System.out.println("4'-----5'");
        for(int i=1; i<=k ; i*=5){
            System.out.println(j+"     "+i);
            j*=4;
        }
        while(j<=k){
            System.out.println(j);
            j*=4;
        }
    }
}
