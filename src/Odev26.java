import java.util.Scanner;

public class Odev26 {
    public static void main(String[] args) {
        int n1,n2,i=1,ebob=1,k;
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz : ");
        n2 = input.nextInt();
        k = Math.min(n1, n2);
        while(i<=k){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB("+n1+","+n2+") = "+ebob);
        System.out.println("EKOK("+n1+","+n2+") = "+(n1*n2/ebob));
    }
}
