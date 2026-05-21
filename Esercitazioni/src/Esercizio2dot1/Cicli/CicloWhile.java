package Esercizio2dot1.Cicli;

import java.util.Scanner;

public class CicloWhile {

    static Scanner myObj = new Scanner(System.in);

    // Stampa da 10 a 1
    public static void printCountdown() {
        int conteggio = 10;
        while (conteggio >= 1) {
            System.out.println(conteggio);
            conteggio--;
        }
    }

    // Legge numeri dall'utente finché non inserisce 0
    public static int readUntilZero() {
        int n = -1;
        int somma = 0;
        while (n != 0) {
            System.out.println("Inserisci un numero (0 per uscire):");
            n = myObj.nextInt();
            somma += n;
        }
        return somma;
    }

    // Genera un numero casuale tra 1 e 50
    public static int generateRandom() {
        return (int) ((Math.random() * (50 - 1) + 1));
    }

    // Legge tentativi finché non indovina
    public static void guessNumber(int target) {
        int guess;
        do {
            System.out.println("Scrivi un numero:");
            guess = myObj.nextInt();
            if (guess != target) {
                System.out.println("Non hai indovinato.");
            }
        } while (guess != target);
        System.out.println("Hai indovinato!");
    }

    // Legge un intero positivo
    public static int readPositive() {
        int n;
        do {
            System.out.println("Scrivi un numero positivo:");
            n = myObj.nextInt();
            if (n < 0) {
                System.out.println("Il numero deve essere positivo.");
            }
        } while (n < 0);
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Somma: " + readUntilZero());
        guessNumber(generateRandom());
        System.out.println("Numero positivo: " + readPositive());
    }
}