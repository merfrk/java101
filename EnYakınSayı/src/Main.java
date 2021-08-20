import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr ={15, 12, 788, 1, -1, -778, 2, 0};
        int number;
        System.out.println("Dizi : "+Arrays.toString(arr));
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scan.nextInt();
        System.out.println("Girilen Sayı : "+number);
        int justSmaller = Integer.MIN_VALUE;
        int justGreater = Integer.MAX_VALUE;
        for (int i: arr) {
            if(i < number && i > justSmaller){
                 justSmaller = i;
            }
            if(i > number && i < justGreater){
                justGreater = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ justSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+ justGreater);
    }
}
