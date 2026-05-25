package com.javafactories.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class ListUtilsV2 {
    private final Scanner myObj = new Scanner(System.in);

    public ListUtilsV2() {
    }

    // --- List<String> ---

    public static List<String> addNames(List<String> lista) {
        String keyword = myObj.nextLine();
        while (!keyword.equals("Stop")) {
            lista.add(keyword);
            keyword = myObj.nextLine();
        }
        return lista;
    }

    public static void printNames(List<String> lista) {
        for (String n : lista)
            System.out.println(n);
    }

    public static void printThirdElement(List<String> lista) {
        if (lista.size() > 2)
            System.out.println(lista.get(2));
        else
            System.out.println("Indice non valido");
    }

    public static void replaceElement(List<String> lista, String newName) {
        lista.set(1, newName);
    }

    public static void removeElement(List<String> lista) {
        lista.remove(lista.size() - 1);
    }

    public boolean checkElement(List<String> lista, String element) {
        return lista.contains(element);
    }

    public static int containedPosition(List<String> lista, String element)
    {
        if (checkElement(lista, element))
        {
            return lista.indexOf(element);
        }
        return -1;
    }

    public static List<String> convertArrayToLists(String[] arr)
    {
        return Arrays.asList(arr);
    }

    // --- List<Integer> ---

    public static List<Integer> addNumbers(List<Integer> numeri) {
        Integer keyword = myObj.nextInt();
        while (keyword != -1) {
            numeri.add(keyword);
            keyword = myObj.nextInt();
        }
        return numeri;
    }

    public static int sumNumbers(List<Integer> numeri) {
        int sum = 0;
        for (int n : numeri)
            sum += n;
        return sum;
    }

    public static void removeEven(List<Integer> numeri) {
        numeri.removeIf(n -> n % 2 == 0);
    }

    public static void sortNumbers(List<Integer> numeri) {
        numeri.sort(null);
    }

    public static void reverseNumbers(List<Integer> numeri) {
        Collections.reverse(numeri);
    }
}
