package com.javafactories.collections;

import java.util.ArrayList;
import java.util.List;

public final class ListUtils {

    private ListUtils() {}

    public static List<Integer> of(int... values) {
        List<Integer> list = new ArrayList<>();
        for (int v : values) list.add(v);
        return list;
    }

    /** Returns a list [0, 1, 2, ..., n-1]. */
    public static List<Integer> range(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        return list;
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) reversed.add(list.get(i));
        return reversed;
    }

    public static int max(List<Integer> list) {
        int max = list.get(0);
        for (int n : list) if (n > max) max = n;
        return max;
    }

    public static int min(List<Integer> list) {
        int min = list.get(0);
        for (int n : list) if (n < min) min = n;
        return min;
    }

    public static double average(List<Integer> list) {
        int total = 0;
        for (int n : list) total += n;
        return (double) total / list.size();
    }

    public static List<Integer> filterAbove(List<Integer> list, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int n : list) if (n >= threshold) result.add(n);
        return result;
    }
}
