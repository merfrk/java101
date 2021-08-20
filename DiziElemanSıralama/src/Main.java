import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array ;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = scan.nextInt();
        array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print((i+1)+". Elemanı : ");
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Sıralama : "+Arrays.toString(array));
    }
}
