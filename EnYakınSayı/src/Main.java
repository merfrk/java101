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
        int smallClose = Integer.MIN_VALUE;
        int bigClose = Integer.MAX_VALUE;
        for (int i: arr) {
            if(i < number && i > smallClose){
                 smallClose = i;
            }
            if(i > number && i < bigClose){
                bigClose = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+smallClose);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+bigClose);
    }
}
