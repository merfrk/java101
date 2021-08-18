import java.util.Scanner;

public class Odev33 {

    static int plus(int a, int b){
        return a + b;
    }
    static int minus(int a, int b){
        return a - b;
    }
    static int times(int a, int b){
        return a * b;
    }
    static int divided(int a, int b){
        return a / b;
    }
    static int power(int a, int b){
        int result=1;
        for(int i = 1; i<= b;i++){
            result *= a;
        }
        return result;
    }
    static int factorial(int n){
            if(n == 0) return 1;
        return n * factorial(n-1);
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void recAreaAndPerimeter(int a, int b){
        int alan = times(a,b);
        int cevre = 2*plus(a,b);
        System.out.println("Alan = "+alan+"\nÇevre = "+cevre);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select,n1,n2=0;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme İşlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";
        System.out.println(menu);
        while (true){
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = scan.nextInt();
            if(select == 0) break;
            else if(select == 6){
                System.out.print("Bir sayı seçin : ");
                n1 = scan.nextInt();
            }
            else if(select == 9){
                System.out.println("Yanlış bir değer girdiniz , lütfen tekrar deneyin");
                continue;
            }
            else{
                System.out.print("Sayı 1 = ");
                n1 = scan.nextInt();
                System.out.print("Sayı 2 = ");
                n2 = scan.nextInt();
            }

            switch (select) {
                case 1 -> System.out.println("Toplam = " + plus(n1, n2));
                case 2 -> System.out.println("Çıkarma = " + minus(n1, n2));
                case 3 -> System.out.println("Çarpım = " + times(n1, n2));
                case 4 -> System.out.println("Bölüm = " + divided(n1, n2));
                case 5 -> System.out.println("Üs alma = " + power(n1, n2));
                case 6 -> System.out.println(factorial(n1));
                case 7 -> System.out.println("Mod = " + mod(n1, n2));
                case 8 -> recAreaAndPerimeter(n1, n2);
            }
        }
    }
}
