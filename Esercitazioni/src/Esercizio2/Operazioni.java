package Esercizio2;

public class Operazioni {

    void operations()
    {
        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);

        int sum = a + b;
        System.out.println("Sum " + sum);

        int diff = a - b;
        System.out.println("Diff " + diff);

        int product = a * b;
        System.out.println("Product " + product);

        if ( b > 0)
        {
            int div = a / b;
            System.out.println("Division " + div);
            int module = a % b;
            System.out.println(("Module " + module));
        }

    }

    public static void main(String[] args) {

        long start = System.nanoTime();

        Operazioni operations = new Operazioni();
        operations.operations();

        long end = System.nanoTime();
        System.out.println("Runtime: " + (end - start) + " ns");

    }
}


