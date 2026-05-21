package Esercizio2dot1.Cicli;

import java.util.Scanner;
import static Esercizio2dot1.Cicli.Array2D.insertMatrix;

public class ArrayCombinator {

    private static final Scanner scanner = new Scanner(System.in);

    public static int sumRow(int[][] matrice, int riga) {
        int total = 0;

        for (int m : matrice[riga])
            total += m;

        return total;
    }

    public static int sumColumn(int[][] matrice, int colonna) {
        int total = 0;

        for (int i = 0; i < matrice.length; i++)
            total += matrice[i][colonna];

        return total;
    }

    public static void evenValues(int[][] matrice) {
        for (int[] riga : matrice)
            for (int m : riga)
                if (m % 2 == 0)
                    System.out.println(m);
    }

    public static boolean searchValue(int[][] matrice, int x) {
        int n = matrice.length, m = matrice[0].length;

        int lo = 0, hi = n * m - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrice[row][col] == x) {
                System.out.println("Trovato in posizione [" + row + "][" + col + "]");
                return true;
            }

            if (matrice[row][col] < x)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return false;
    }

    public static int negativeValues(int[][] matrice) {
        int count = 0;

        for (int[] riga : matrice)
            for (int m : riga)
                if (m < 0)
                    count++;

        return count;
    }

    public static void main(String[] args) {
        int[][] matrice = insertMatrix(3, 3);

        System.out.println("Indice riga da sommare:");
        int riga = scanner.nextInt();
        System.out.println("Somma riga: " + sumRow(matrice, riga));

        System.out.println("Indice colonna da sommare:");
        int colonna = scanner.nextInt();
        System.out.println("Somma colonna: " + sumColumn(matrice, colonna));

        System.out.println("Valori pari:");
        evenValues(matrice);

        System.out.println("Valore da cercare:");
        int x = scanner.nextInt();
        if (!searchValue(matrice, x))
            System.out.println("Valore non trovato.");

        System.out.println("Valori negativi: " + negativeValues(matrice));
    }
}