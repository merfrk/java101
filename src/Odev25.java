import java.util.Scanner;

public class Odev25 {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int hak=3;
        int bakiye=1500;
        int select=0;
        boolean isSuccess=false;

        while(hak > 0){
            System.out.println("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
                isSuccess =true;
                System.out.println("Merhaba Kodluyoruz Bankasına hoşgeldiniz!");
                break;
            }
            else{
                hak--;
                if(hak == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankamızla en yakın zamanda iletişime geçin.");
                }
                else{
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız : "+hak);
                }
            }
        }
        while(isSuccess  && select != 4){
            System.out.println("""
                    1_Para Yatırma
                    2_Para Çekme
                    3_Bakiye Sorgulama
                    4_Çıkış""");
            System.out.print("\nLütfen yapmak istediğiniz işlemi seçin : ");
            select = input.nextInt();
            switch(select){
                case 1:
                    System.out.print("Lütfen yatıracağınız para miktarını giriniz : ");
                    int price = input.nextInt();
                    bakiye += price;
                    break;
                case 2:
                    System.out.println("Lütfen çekmek istediğiniz para miktarını giriniz : ");
                    int price2 = input.nextInt();
                    if(price2 >= bakiye){
                        System.out.println("Bakiyeniz yetersiz !");
                    }
                    else{
                        bakiye -= price2;
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz : "+bakiye);
                    break;
                case 4:
                    System.out.println("İyi günler ...");
                    break;
                default:
                    break;
            }

        }
    }
}
