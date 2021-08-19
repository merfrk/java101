import java.util.Scanner;

public class Odev36{


    static void f(int n){
        rise(drop(n),n);
    }
    static int rise(int a,int n){
        System.out.print(a+" ");
        if(a == n) return a;
        return rise(a+5,n);
    }
    static int drop(int a){
        if(a <= 0) return a;
        System.out.print(a+" ");
        return drop(a-5);
    }
    public static void main(String []args){
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        N = scan.nextInt();
        System.out.print("Çıktısı : ");
        f(N);

    }
}
