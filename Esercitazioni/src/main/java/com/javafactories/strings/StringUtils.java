package com.javafactories.strings;

public final class StringUtils {

    private StringUtils() {}

    public static String concat(String separator, String... parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(parts[i]);
            if (i < parts.length - 1) sb.append(separator);
        }
        return sb.toString();
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static char charAt(String s, int index) {
        return s.charAt(index);
    }

    public static String[] splitWords(String sentence) {
        return sentence.split(" ");
    }

    public static int length(String s) {
        return s.length();
    }

    public static boolean equalsStrict(String a, String b) {
        return a.equals(b);
    }

    public static boolean equalsIgnoreCase(String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    public static boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    public static boolean isLetter(char c) {
        return Character.isLetter(c);
    }
}
