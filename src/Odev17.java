import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        int k,sum=0,j=0,avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        k = input.nextInt();
        for(int i=1 ; i<=k ; i++){
            if(i % 12 == 0){
                sum += i;
                j++;
            }
        }
        avg = sum / j;
        System.out.println(avg);
    }
}
