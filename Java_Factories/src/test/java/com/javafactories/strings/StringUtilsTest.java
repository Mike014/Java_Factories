package com.javafactories.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void concatJoinsWithSeparator() {
        assertEquals("hello world", StringUtils.concat(" ", "hello", "world"));
    }

    @Test
    void concatSinglePartReturnsItself() {
        assertEquals("hello", StringUtils.concat(",", "hello"));
    }

    @Test
    void toUpperCaseWorks() {
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
    }

    @Test
    void toLowerCaseWorks() {
        assertEquals("java", StringUtils.toLowerCase("JAVA"));
    }

    @Test
    void charAtReturnsCorrectCharacter() {
        assertEquals('a', StringUtils.charAt("java", 1));
    }

    @Test
    void splitWordsReturnsTokens() {
        assertArrayEquals(new String[]{"hello", "world"}, StringUtils.splitWords("hello world"));
    }

    @Test
    void equalsStrictIsCaseSensitive() {
        assertTrue(StringUtils.equalsStrict("abc", "abc"));
        assertFalse(StringUtils.equalsStrict("abc", "ABC"));
    }

    @Test
    void equalsIgnoreCaseIgnoresCase() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    void isUpperCaseDetectsCapital() {
        assertTrue(StringUtils.isUpperCase('A'));
        assertFalse(StringUtils.isUpperCase('a'));
    }
}
