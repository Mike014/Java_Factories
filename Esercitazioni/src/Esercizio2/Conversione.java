package Esercizio2;

import java.util.Scanner;

public class Conversione {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Inserisci il valore intero a : ");
        double a = myObj.nextDouble();

        System.out.println("Il valore di a double è : " + a + "\nIl valore di a int è : " + (int)a);
    }

}
