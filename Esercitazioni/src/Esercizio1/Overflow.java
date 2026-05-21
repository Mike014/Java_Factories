package Esercizio1;

public class Overflow {

    private byte b = 127;

    public static void main(String[] args)
    {
        Overflow overflow = new Overflow();
        overflow.b = (byte)(overflow.b + 1);

        System.out.println(overflow.b);
    }
}
