
public class Odev30 {
    public static void main(String[] args) {
       boolean flag = false;
        for(int j = 2; j <= 100; j++){
            for(int i=2; i<=j/2; i++){
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.print(j+" ");
            flag = false;
        }

    }
}
