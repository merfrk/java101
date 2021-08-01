import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz :");
        heat = input.nextInt();
        if(heat < 5) System.out.println("Kayak yapabilirsiniz");
        else if(heat < 15) System.out.println("Sinemaya gidebilirsiniz");
        else if(heat < 25) System.out.println("Pikniğe gidebilirsiniz");
        else System.out.println("Yüzmeye gidebilirsiniz");
    }
}
