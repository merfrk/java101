import java.util.Scanner;

public class Odev23 {
    public static void main(String[] args) {
        int k ;
        float result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harmonik serisinin bulunmasını istediğiniz sayıyı giriniz");
        k = scan.nextInt();
        for(int i = 1; i<= k; i++){
            result+=1.0 / i;
        }
        System.out.println(result);
    }
}
