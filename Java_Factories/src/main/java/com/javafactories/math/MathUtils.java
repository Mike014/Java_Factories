package com.javafactories.math;

public final class MathUtils {

    private MathUtils() {}

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    /** @throws ArithmeticException if b is zero */
    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return (double) a / b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    public static int sumRange(int from, int to) {
        int total = 0;
        for (int i = from; i <= to; i++) total += i;
        return total;
    }

    /** Returns elapsed nanoseconds for the given operation. */
    public static long measureNanos(Runnable operation) {
        long start = System.nanoTime();
        operation.run();
        return System.nanoTime() - start;
    }
}
