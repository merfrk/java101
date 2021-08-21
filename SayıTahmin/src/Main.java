import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);
        Scanner scan = new Scanner(System.in);
        int right = 9;
        int selected;
        while(right > 0){
            System.out.println(right+" hakkınız var");
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = scan.nextInt();
            if(selected < 0 || selected > 100){
                right--;
                if(right == 0){
                    System.out.println("Game over ..");
                    continue;
                }
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz !");
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler doğru sayı = "+number);
                break;
            }
                if(selected < number){
                    System.out.println("Yukarı çıkın");
                }
                else {
                    System.out.println("Aşağı inin");
                }
                    right--;
        }
    }
}
