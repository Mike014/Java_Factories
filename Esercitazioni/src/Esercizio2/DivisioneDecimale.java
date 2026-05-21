package Esercizio2;
import java.util.Scanner;

public class DivisioneDecimale {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        long start = System.nanoTime();

        System.out.println("Inserisci il valore intero a : ");
        int a = myObj.nextInt();
        System.out.println("Inserisci il valore intero b : ");
        int b = myObj.nextInt();

        double result;

        if (b > 0)
        {
            result = (double) a / b;
            System.out.println(result);
        }

        long end = System.nanoTime();
        System.out.println("Runtime: " + (end - start) + " ns");

    }
}
