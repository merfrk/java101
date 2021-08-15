import java.util.Scanner;

public class Odev31 {
    public static void main(String[] args) {
        int n,k=1,l=1,temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();
        System.out.print("0 ");
        for(int i = 0; i<n; i++){
            System.out.print(k+" ");
            temp = l;
            l += k;
            k = temp;
        }
    }
}
