import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        int a,b,c;
        double s,alan,m;
        Scanner input = new Scanner(System.in);

        System.out.println("Üçgenin ilk kenraını giriniz :");
        a = input.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz :");
        b=input.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz :");
        c=input.nextInt();

        s=(a+b+c)/2.0;
        m =s * (s-a) * (s-b) * (s-c);
        alan=Math.sqrt(m);
        System.out.println("Üçgenin Alanı = "+alan);




    }
}
