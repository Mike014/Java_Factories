package com.javafactories.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void maxReturnsLarger() {
        assertEquals(10, MathUtils.max(3, 10));
        assertEquals(10, MathUtils.max(10, 3));
    }

    @Test
    void minReturnsSmaller() {
        assertEquals(3, MathUtils.min(3, 10));
    }

    @Test
    void divideReturnsDecimalResult() {
        assertEquals(2.5, MathUtils.divide(5, 2));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(5, 0));
    }

    @Test
    void isEvenIdentifiesEvenNumbers() {
        assertTrue(MathUtils.isEven(4));
        assertFalse(MathUtils.isEven(3));
    }

    @Test
    void isDivisibleChecksRemainder() {
        assertTrue(MathUtils.isDivisible(10, 2));
        assertFalse(MathUtils.isDivisible(10, 3));
    }

    @Test
    void sumRangeComputesGaussSum() {
        assertEquals(5050, MathUtils.sumRange(1, 100));
    }
}
