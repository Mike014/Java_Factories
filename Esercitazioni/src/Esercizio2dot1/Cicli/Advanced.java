package Esercizio2dot1.Cicli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advanced {

    private static final Scanner scanner = new Scanner(System.in);

    private static List<Integer> createList() {
        return new ArrayList<>();
    }

    public static List<Integer> flexibleArrays(int n) {
        List<Integer> lista = createList();

        for (int i = 0; i < n; i++)
            lista.add(i);

        return lista;
    }

    public static void reverseList(List<Integer> lista) {
        for (int i = lista.size() - 1; i >= 0; i--)
            System.out.println(lista.get(i));
    }

    public static List<List<Integer>> dynamicMatrix(List<List<Integer>> lista) {
        for (int i = 0; i < lista.size(); i++)
            for (int j = 0; j < lista.get(i).size(); j++)
                lista.get(i).set(j, scanner.nextInt());

        return lista;
    }

    public static int sumDynamicMatrix(List<List<Integer>> lista) {
        int total = 0;

        for (List<Integer> riga : lista)
            for (int m : riga)
                total += m;

        return total;
    }

    public static void diagonaleMatrix(List<List<Integer>> lista) {
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i).get(i));
    }
}