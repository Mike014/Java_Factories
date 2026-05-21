package Esercizio2;

public class Somma {

    public static void main(String[] args) {
        long start = System.nanoTime();

        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);
        int sum = a + b;
        System.out.println(sum);

        long end = System.nanoTime();
        System.out.println("Runtime: " + (end - start) + " ns");
    }
}
