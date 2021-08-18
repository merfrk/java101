import java.util.Scanner;

public class Odev34 {
    static int exp(int base, int pow){
        if(pow == 0) return 1;
        return base * exp(base,pow-1);
    }
    public static void main(String[] args) {
        int base,pow;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        base = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        pow = inp.nextInt();
        System.out.println("Sonuç = "+exp(base,pow));
    }
}
