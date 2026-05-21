package Esercizio1;

public class Caratteri {
    public static void main(String[] args)
    {
        char _A = 'A';
        char _n = '5';
        char _unicode =  '\u00A9';

        Object[] contenitore = { _A, _n, _unicode };

        for (Object elemento : contenitore)
        {
            System.out.println(elemento);
        }
    }
}
