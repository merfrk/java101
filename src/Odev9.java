import java.util.Scanner;

public class Odev9 {
    public static void main(String[] args) {
        String userName,password = "java123", temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz");
        userName=input.nextLine();
        System.out.println("Şifrenizi giriniz");
        temp = input.nextLine();
        if(userName.equals("patika") && temp.equals(password)) System.out.println("Sisteme giriş: Başarılı");
        else System.out.println("Kullanıcı adı veya şifre hatalı !");

    }
}
