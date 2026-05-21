package Esercizio2;
import java.util.Scanner;

public class MaiuscoloMinuscolo
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Scrivi una parola");
        String parola = myObj.nextLine();

        System.out.println("Maiuscolo: " + parola.toUpperCase());
        System.out.println("Minuscolo: " + parola.toLowerCase());
    }
}
