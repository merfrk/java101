import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        int math,physics,Turkish,chemistry,music;
            Scanner input = new Scanner(System.in);
            System.out.println("math note :");
            math = input.nextInt();
            System.out.println("physics note :");
            physics = input.nextInt();
            System.out.println("Turkish note :");
            Turkish = input.nextInt();
            System.out.println("chemistry note :");
            chemistry = input.nextInt();
            System.out.println("music note :");
            music = input.nextInt();
        double avg = (math+physics+Turkish+chemistry+music)/5.0;
        if(avg >= 55) System.out.println("Tebrikler sınıfı geçtiniz ***");
        else System.out.println("Sınıfta kaldınız :(");

    }
}
