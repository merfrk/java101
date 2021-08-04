import java.util.Scanner;

public class Odev20 {
    public static void main(String[] args) {
        int n,r,nFakt=1,rFakt=1,fakt=1,k,komb;
        Scanner scan = new Scanner(System.in);
        System.out.print("C(n,r) deki n i giriniz : ");
        n = scan.nextInt();
        System.out.print("C(n,r) deki r yi giriniz :");
        r = scan.nextInt();
        k=n-r;
            for(int i=1;i<=n;i++) nFakt *= i;
            for(int j=1;j<=r;j++) rFakt *= j;
            for(int s=1;s<=k;s++) fakt *= s;
            komb = nFakt / (rFakt*fakt);
        System.out.println("C("+n+","+r+") = "+komb);
    }
}
