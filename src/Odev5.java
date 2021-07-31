import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        double r,alfa,pi=3.14,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire dilimin yarıçapını giriniz : ");
        r=input.nextDouble();
        System.out.println("Daire diliminin merkez açısının ölçüsünü giriniz : ");
        alfa=input.nextDouble();
        alan=(pi*(r*r)*alfa)/360;
        System.out.println("Daire diliminin alanı = "+alan);
    }
}
