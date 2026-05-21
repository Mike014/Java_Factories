package Esercizio2;
import java.util.Scanner;

public class PariODispari {

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int numero = myObj.nextInt();

        if (numero % 2 == 0)
            System.out.println("Il numero è pari");
        else
            System.out.println("Il numero è dispari");
    }
}
