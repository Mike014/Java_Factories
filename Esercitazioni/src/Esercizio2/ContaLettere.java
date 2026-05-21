package Esercizio2;
import java.util.Scanner;

public class ContaLettere
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Inserisci parola");
        String parola = myObj.nextLine();

        for (int i = 0; i < parola.length(); i++)
        {
            System.out.println(parola.charAt(i));
        }

        System.out.println("La lunghezza è : " + parola.length());
    }
}
