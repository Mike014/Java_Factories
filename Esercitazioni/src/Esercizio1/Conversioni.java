package Esercizio1;

public class Conversioni {

    public static void main(String[] args) {

        int a = 5;
        double b = a; // Conversione implicita automatica
        System.out.println("Conversione implicita: " + b);

        int c = (int)b;
        System.out.println("Conversione esplicita: " + c);
    }
}
