package com.javafactories.collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    @Test
    void ofCreatesListFromValues() {
        assertEquals(List.of(1, 2, 3), ListUtils.of(1, 2, 3));
    }

    @Test
    void rangeCreatesZeroBasedList() {
        assertEquals(List.of(0, 1, 2, 3), ListUtils.range(4));
    }

    @Test
    void reverseInvertsOrder() {
        assertEquals(List.of(3, 2, 1), ListUtils.reverse(ListUtils.of(1, 2, 3)));
    }

    @Test
    void maxReturnsLargestElement() {
        assertEquals(9, ListUtils.max(ListUtils.of(3, 9, 1, 7)));
    }

    @Test
    void minReturnsSmallestElement() {
        assertEquals(1, ListUtils.min(ListUtils.of(3, 9, 1, 7)));
    }

    @Test
    void averageComputesCorrectly() {
        assertEquals(3.0, ListUtils.average(ListUtils.of(1, 2, 3, 4, 5)));
    }

    @Test
    void filterAboveKeepsValuesAtOrAboveThreshold() {
        assertEquals(List.of(10, 15), ListUtils.filterAbove(ListUtils.of(5, 10, 3, 15), 10));
    }
}
