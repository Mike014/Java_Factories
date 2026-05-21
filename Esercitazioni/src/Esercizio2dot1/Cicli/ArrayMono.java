package Esercizio2dot1.Cicli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMono {

    private static final Scanner scanner = new Scanner(System.in);

    public static List<Integer> insertNumbers(int count) {
        List<Integer> lista = new ArrayList<>();
        System.out.println("Inserisci " + count + " numeri:");

        for (int i = 0; i < count; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            lista.add(scanner.nextInt());
        }

        return lista;
    }

    public static int max(List<Integer> lista) {
        int max = lista.get(0);
        for (int n : lista)
            if (n > max) max = n;
        return max;
    }

    public static int min(List<Integer> lista) {
        int min = lista.get(0);
        for (int n : lista)
            if (n < min) min = n;
        return min;
    }

    public static double average(List<Integer> lista) {
        int total = 0;
        for (int n : lista)
            total += n;
        return (double) total / lista.size();
    }

    public static List<Integer> filterAbove(List<Integer> lista, int threshold) {
        List<Integer> risultato = new ArrayList<>();
        for (int n : lista)
            if (n >= threshold)
                risultato.add(n);
        return risultato;
    }

    public static List<Integer> reverse(List<Integer> lista) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--)
            reversed.add(lista.get(i));
        return reversed;
    }


    public static void main(String[] args) {
        List<Integer> lista = insertNumbers(5);

//        System.out.println("Max: " + max(lista));
//        System.out.println("Min: " + min(lista));
//        System.out.println("Media: " + average(lista));
//        System.out.println("Elementi >= 10: " + filterAbove(lista, 10));
//        System.out.println("Reversed: " + reverse(lista));
    }
}