public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int j : arr) {
            sum += (1.0 / j);
        }
        System.out.println(arr.length/sum);
    }
}
