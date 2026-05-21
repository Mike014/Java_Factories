package Esercizio2;
import java.util.Scanner;

public class AnalisiChar
{
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Scrivi un carattere: ");

        String carattere = myObj.nextLine();
        while (carattere.length() != 1 || !carattere.equals(carattere.toUpperCase()))
        {
            System.out.println("Inserisci solo un carattere");
            carattere = myObj.nextLine();
        }

        char primoCarattere = carattere.charAt(0);

        System.out.println("Il primo carattere è : " + primoCarattere);
    }
}


