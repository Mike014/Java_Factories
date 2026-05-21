package Esercizio2;
import java.util.Scanner;

public class CreaFrase
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Inserisci una frase");
        String frase = myObj.nextLine();
        String[] parole = frase.split(" ");

        for (int i = 0; i < parole.length; i++)
        {
            System.out.println(parole[i]);
        }
    }
}
