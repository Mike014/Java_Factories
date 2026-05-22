package com.javafactories.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void rangeProducesConsecutiveIntegers() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayUtils.range(1, 5));
    }

    @Test
    void evenRangeProducesEvenNumbers() {
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, ArrayUtils.evenRange(2, 10));
    }

    @Test
    void sumAddsAllElements() {
        assertEquals(15, ArrayUtils.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void sumRowAddsSelectedRow() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(15, ArrayUtils.sumRow(matrix, 1));
    }

    @Test
    void sumColumnAddsSelectedColumn() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(7, ArrayUtils.sumColumn(matrix, 1));
    }

    @Test
    void evenValuesFiltersCorrectly() {
        assertArrayEquals(new int[]{2, 4}, ArrayUtils.evenValues(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void negativeValuesFiltersCorrectly() {
        assertArrayEquals(new int[]{-3, -1}, ArrayUtils.negativeValues(new int[]{-3, 2, -1, 4}));
    }

    @Test
    void binarySearchFindsValue() {
        int[][] matrix = {{1, 3, 5}, {7, 9, 11}};
        int idx = ArrayUtils.binarySearch(matrix, 9);
        assertTrue(idx >= 0);
    }

    @Test
    void binarySearchReturnsNegativeOneWhenMissing() {
        int[][] matrix = {{1, 3, 5}, {7, 9, 11}};
        assertEquals(-1, ArrayUtils.binarySearch(matrix, 4));
    }
}
