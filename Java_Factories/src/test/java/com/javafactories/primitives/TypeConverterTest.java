package com.javafactories.primitives;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TypeConverterTest {

    @Test
    void toDoublePreservesValue() {
        assertEquals(5.0, TypeConverter.toDouble(5));
    }

    @Test
    void toIntTruncatesDecimal() {
        assertEquals(3, TypeConverter.toInt(3.9));
        assertEquals(-3, TypeConverter.toInt(-3.9));
    }

    @Test
    void toCharConvertsAscii() {
        assertEquals('A', TypeConverter.toChar(65));
    }

    @Test
    void toBinaryReturnsCorrectString() {
        assertEquals("1010", TypeConverter.toBinary(10));
    }

    @Test
    void toHexReturnsCorrectString() {
        assertEquals("ff", TypeConverter.toHex(255));
    }

    @Test
    void byteOverflowWrapAround() {
        // 127 + 1 wraps to -128 (classic byte overflow)
        assertEquals((byte) -128, TypeConverter.addByte((byte) 127, (byte) 1));
    }

    @Test
    void wouldOverflowByteDetectsOutOfRange() {
        assertTrue(TypeConverter.wouldOverflowByte(128));
        assertFalse(TypeConverter.wouldOverflowByte(127));
    }
}
