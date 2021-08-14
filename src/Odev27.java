import java.util.Scanner;

public class Odev27 {
    public static void main(String[] args) {
        int count,max=0,min=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz : ");
        count = input.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            int number = input.nextInt();
                if(i == 1){
                    min = number;
                    max = number;
                }
                if(number > max) max = number;
                if(number < min) min = number;
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);
    }
}
