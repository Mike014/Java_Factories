package Esercizio2;
import java.util.Scanner;

public class Concatena
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Inserisci la prima parola : ");
        String primaParola = myObj.nextLine();
        System.out.println("Inserisci la seconda parola : ");
        String secondaParola = myObj.nextLine();

        System.out.println(primaParola + " " + secondaParola);
    }
}
