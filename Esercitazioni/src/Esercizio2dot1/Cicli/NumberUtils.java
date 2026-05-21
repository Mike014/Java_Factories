package Esercizio2dot1.Cicli;

public class NumberUtils {

    public static int[] rangeArray(int from, int to) {
        int size = to - from + 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = from + i;
        }
        return arr;
    }

    public static int[] evenRangeArray(int from, int to) {
        int size = (to - from) / 2 + 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = from + i * 2;
        }
        return arr;
    }

    public static int sum(int from, int to) {
        int total = 0;
        for (int i = from; i <= to; i++) {
            total += i;
        }
        return total;
    }

    public static boolean isDivisible(int dividend, int divider) {
        return dividend % divider == 0;
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        printArray(rangeArray(1, 20));
        printArray(evenRangeArray(2, 50));
        System.out.println(sum(1, 100));
        System.out.println(isDivisible(10, 2));
    }
}
