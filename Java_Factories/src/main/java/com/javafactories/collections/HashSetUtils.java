package com.javafactories.collections;

import java.util.*;

public class HashSetUtils {
    private final Scanner myObj = new Scanner(System.in);

    public boolean checkElement(Set<Integer> set, int num) {
        return set.contains(num);
    }

    public void printSetElements(Set<Integer> set) {
        for (int n : set)
            System.out.println(n);
    }

    public List<Integer> convertSetToList(Set<Integer> set) {
        return new ArrayList<Integer>(set);
    }

    public TreeSet<Integer> sortSet(Set<Integer> set)
    {
        return new TreeSet<>(set);
    }

    public void removeElements(Set<Integer> set, int num) {
        set.removeIf(n -> n < num);
    }

    public Set<Integer> unionSet(Set<Integer> A, Set<Integer>B)
    {
        Set<Integer> result = new HashSet<>(A);
        result.addAll(B);
        return result;
    }

    public Set<Integer> diffSet(Set<Integer> A, Set<Integer>B)
    {
        Set<Integer> result = new HashSet<>(A);
        result.removeAll(B);
        return result;
    }
}
