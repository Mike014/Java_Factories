package com.javafactories.primitives;

public final class TypeConverter {

    private TypeConverter() {}

    public static double toDouble(int value) {
        return value;
    }

    public static int toInt(double value) {
        return (int) value;
    }

    public static char toChar(int value) {
        return (char) value;
    }

    public static String toBinary(int value) {
        return Integer.toBinaryString(value);
    }

    public static String toHex(int value) {
        return Integer.toHexString(value);
    }

    /** Returns true if adding 1 to a max-value byte would overflow. */
    public static boolean wouldOverflowByte(int value) {
        return value > Byte.MAX_VALUE || value < Byte.MIN_VALUE;
    }

    /** Performs byte addition, demonstrating wrap-around overflow. */
    public static byte addByte(byte a, byte b) {
        return (byte) (a + b);
    }
}
