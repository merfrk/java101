import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int rowNumber ;
    int colNumber ;
   public MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }
    public void printGame(String[][] temp){
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int howMany(String[][] arr ,int row, int col){
       int count = 0;
        for (int i = row-1; i <= row+1 ; i++) {
            if(i > arr.length -1 || i < 0 ){
                continue;
            }
            for (int j = col-1; j <= col+1 ; j++) {
                if(j > arr[0].length -1 || j < 0) continue;
                if(Objects.equals(arr[i][j], "*")){
                    count++;
                }
            }
        }
        return count;
    }
    public void run(){
        String[][] temp = new String[rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                temp[i][j] = "-";
            }
        }
        String[][] game = new String[rowNumber][colNumber];
        int mineNumber = (rowNumber * colNumber) / 4;
        int finish = (rowNumber*colNumber) - mineNumber;
        Random r = new Random();
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if(r.nextBoolean() && mineNumber > 0){
                    game[i][j] = "*";
                    mineNumber--;
                }
                else game[i][j] = "-";
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(game[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        while (true){
            printGame(temp);
            System.out.print("Satır Giriniz : ");
            int row = scan.nextInt() -1 ;
            System.out.print("Sütun Giriniz : ");
            int col = scan.nextInt() -1 ;
            System.out.println("===========================");
            if((row < 0 || row > rowNumber) || (col < 0 || col > colNumber)){
                System.out.println("Geçersiz koordinat !");
                continue;
            }
            if(Objects.equals(game[row][col], "*")){
                System.out.println("Game Over !");
                break;
            }
            else{
                finish--;
                temp[row][col] = ""+howMany(game,row,col);
                if(finish == 0){
                    System.out.println("Tebrikler Oyunu Kazandınız !");
                    printGame(temp);
                    break;
                }
            }
        }

    }
}
