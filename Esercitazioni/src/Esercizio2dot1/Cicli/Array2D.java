package Esercizio2dot1.Cicli;

//import java.util.ArrayList;
//import java.util.List;

import java.util.Scanner;

public class Array2D {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[][] insertMatrix(int righe, int colonne) {
        int[][] matrice = new int[righe][colonne];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }

        return matrice;
    }

    public static int sumMatrix(int[][] matrice) {
        int total = 0;

        for (int n[] : matrice)
            for (int m : n)
                total += m;

        return total;
    }

    public static void diagonalMatrix(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++)
            System.out.println(matrice[i][i]);
    }
}

