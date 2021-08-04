import java.util.Scanner;

public class Odev18 {
    public static void main(String[] args) {
        int k=0,sum=0;
        Scanner input = new Scanner(System.in);
        while(k%2 !=1){
            System.out.println("Sayı giriniz");
            k = input.nextInt();
            if(k%4 == 0){
                sum += k;
            }
        }
        System.out.println(sum);
    }
}
