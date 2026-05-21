package Esercizio2;

public class MaggioreMinore
{
    public static void main(String[] args) {

        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);

        if (a > b)
        {
            System.out.println("Il maggiore e': " + a);
        }
        else if (a == b)
        {
            System.out.println("Sono uguali: " + a);
        }
        else
        {
            System.out.println("Il maggiore e': " + b);
        }
    }
}