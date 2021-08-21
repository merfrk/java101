import java.util.Arrays;

public class Main {
    static void DuplicateTime(int[] array){
        System.out.println("Dizi : "+Arrays.toString(array));
        System.out.println("Tekrar Sayıları");
        int[] frequency = new int[array.length];
        int dup = 2;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i+1; j < array.length; j++) {
                if(i != j && array[i] == array[j]){
                    count++;
                    frequency[j] = dup;
                }
            }
            if(frequency[i] != dup){
                frequency[i] = count;
            }

        }
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] != dup){
                System.out.println(array[i]+" sayısı "+frequency[i]+" kere tekrar edildi.");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5,20};
        DuplicateTime(arr);
    }
}
