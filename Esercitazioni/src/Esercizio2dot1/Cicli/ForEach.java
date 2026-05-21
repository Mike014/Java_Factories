package Esercizio2dot1.Cicli;

import java.util.Scanner;

public class ForEach {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printElement(int[] arr) {
        for (int n : arr)
            System.out.println(n);
    }

    public static int sumArrays(int[] arr) {
        int somma = 0;

        for (int n : arr)
            somma += n;

        return somma;
    }

    public static void printEvenNumbers(int[] arr) {
        for (int n : arr)

            if (n % 2 == 0) {
                System.out.println(n);
            }
    }

    public static int readNumber() {
        System.out.println("Inserisci un numero: ");
        return scanner.nextInt();
    }

    public static boolean searchNumber(int[] arr) {
        int n = readNumber();
        for (int m : arr)
            if (m == n)
                return true;
        return false;
    }

    public static String concatenateStrings(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (String n : arr) {
            sb.append(n);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test it
    }
}

