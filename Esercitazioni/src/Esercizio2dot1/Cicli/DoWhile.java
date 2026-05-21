package Esercizio2dot1.Cicli;

import java.util.Scanner;

public class DoWhile {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readName() {
        String name;
        do {
            System.out.println("Scrivi un nome (minimo 2 caratteri):");
            name = scanner.nextLine();
        } while (name.length() < 2);
        return name;
    }

    public static int readPositiveInt() {
        int n;
        do {
            System.out.println("Digita un numero positivo:");
            n = scanner.nextInt();
        } while (n < 0);
        return n;
    }

    public static String readConfirmation() {
        String answer;
        do {
            System.out.println("Vuoi uscire? (s/n):");
            answer = scanner.nextLine();
        } while (!answer.equals("s") && !answer.equals("n"));
        return answer;
    }

    public static int readMenuChoice() {
        int choice;
        do {
            System.out.println("Digita un numero non valido:");
            choice = scanner.nextInt();
        } while (choice < 0 || choice > 3);
        return choice;
    }

    public static int sumUntilThreshold(int threshold) {
        int n;
        int total = 0;
        do {
            System.out.println("Inserisci un numero (" + threshold + " o più per uscire):");
            n = scanner.nextInt();
            total += n;
        } while (n < threshold);
        return total;
    }

    public static void runMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Opzione 1");
            System.out.println("2 - Opzione 2");
            System.out.println("3 - Opzione 3");
            System.out.println("0 - Esci");
            choice = scanner.nextInt();
            handleMenuChoice(choice);
        } while (choice != 0);
    }

    private static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1 -> System.out.println("Hai scelto l'opzione 1");
            case 2 -> System.out.println("Hai scelto l'opzione 2");
            case 3 -> System.out.println("Hai scelto l'opzione 3");
            case 0 -> System.out.println("Uscita dal menu");
            default -> System.out.println("Opzione non valida");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nome: " + readName());
        System.out.println("Numero positivo: " + readPositiveInt());
        System.out.println("Somma: " + sumUntilThreshold(100));
        runMenu();
    }
}