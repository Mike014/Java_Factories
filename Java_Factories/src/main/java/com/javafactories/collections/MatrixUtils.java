package com.javafactories.collections;

import java.util.ArrayList;
import java.util.List;

public final class MatrixUtils {

    private MatrixUtils() {}

    public static List<List<Integer>> create(int rows, int cols, int defaultValue) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) row.add(defaultValue);
            matrix.add(row);
        }
        return matrix;
    }

    public static List<List<Integer>> fill(List<List<Integer>> matrix, List<List<Integer>> values) {
        for (int i = 0; i < matrix.size(); i++)
            for (int j = 0; j < matrix.get(i).size(); j++)
                matrix.get(i).set(j, values.get(i).get(j));
        return matrix;
    }

    public static int sum(List<List<Integer>> matrix) {
        int total = 0;
        for (List<Integer> row : matrix) for (int m : row) total += m;
        return total;
    }

    public static int sum(int[][] matrix) {
        int total = 0;
        for (int[] row : matrix) for (int m : row) total += m;
        return total;
    }

    /** @throws IllegalArgumentException if the matrix is not square */
    public static List<Integer> diagonal(List<List<Integer>> matrix) {
        if (matrix.size() != matrix.get(0).size())
            throw new IllegalArgumentException("Matrix must be square");
        List<Integer> diag = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) diag.add(matrix.get(i).get(i));
        return diag;
    }

    public static int diagonalSum(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) total += matrix[i][i];
        return total;
    }
}
