import java.util.Arrays;

public class Main {
    static int[][] transpoze(int[][] arr){
        int[][] tersMatris = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                tersMatris[i][j] = arr[j][i];
            }
        }
        return tersMatris;
    }
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("Matris :");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+"\t\t");
            }
            System.out.println();
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(transpoze(matris)[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}
