package Esercizio2;
import java.util.Scanner;

public class CarattereIndex
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Scrivi una parola");
        String parola = myObj.nextLine();
        System.out.println("Scrivi un numero");
        int numero = myObj.nextInt();

        if (numero > parola.length())
            return;
        System.out.println(parola.charAt(numero));
    }
}
