package com.javafactories.collections;

public final class ArrayUtils {

    private ArrayUtils() {}

    public static int[] range(int from, int to) {
        int size = to - from + 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = from + i;
        return arr;
    }

    public static int[] evenRange(int from, int to) {
        int size = (to - from) / 2 + 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = from + i * 2;
        return arr;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int x : arr) total += x;
        return total;
    }

    public static int sumRow(int[][] matrix, int row) {
        int total = 0;
        for (int m : matrix[row]) total += m;
        return total;
    }

    public static int sumColumn(int[][] matrix, int col) {
        int total = 0;
        for (int[] row : matrix) total += row[col];
        return total;
    }

    public static int[] evenValues(int[] arr) {
        int count = 0;
        for (int x : arr) if (x % 2 == 0) count++;
        int[] result = new int[count];
        int idx = 0;
        for (int x : arr) if (x % 2 == 0) result[idx++] = x;
        return result;
    }

    public static int[] negativeValues(int[] arr) {
        int count = 0;
        for (int x : arr) if (x < 0) count++;
        int[] result = new int[count];
        int idx = 0;
        for (int x : arr) if (x < 0) result[idx++] = x;
        return result;
    }

    /**
     * Binary search on a sorted 2D matrix treated as a flat array.
     * Returns the flat index [row*cols + col], or -1 if not found.
     */
    public static int binarySearch(int[][] matrix, int value) {
        int n = matrix.length, m = matrix[0].length;
        int lo = 0, hi = n * m - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int row = mid / m, col = mid % m;
            if (matrix[row][col] == value) return mid;
            if (matrix[row][col] < value) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
