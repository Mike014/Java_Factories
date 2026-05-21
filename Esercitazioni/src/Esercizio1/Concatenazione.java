package Esercizio1;

import java.io.PrintStream;

public class Concatenazione
{
    private String prima = "prima";
    private String seconda = " seconda";
    private String risultato = prima + seconda;

    public static void main(String[] args)
    {
        Concatenazione concatenazione = new Concatenazione();
        System.out.println(concatenazione.risultato);
    }
}
