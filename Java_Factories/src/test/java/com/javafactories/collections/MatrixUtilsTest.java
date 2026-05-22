package com.javafactories.collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @Test
    void createFillsWithDefaultValue() {
        var matrix = MatrixUtils.create(2, 2, 0);
        assertEquals(0, matrix.get(0).get(0));
        assertEquals(4, matrix.size() + matrix.get(0).size());
    }

    @Test
    void sumAddsAllElements() {
        var m = MatrixUtils.create(2, 2, 3);
        assertEquals(12, MatrixUtils.sum(m));
    }

    @Test
    void sumArrayMatrixAddsAllElements() {
        int[][] m = {{1, 2}, {3, 4}};
        assertEquals(10, MatrixUtils.sum(m));
    }

    @Test
    void diagonalExtractsMainDiagonal() {
        var m = List.of(List.of(1, 0), List.of(0, 2));
        assertEquals(List.of(1, 2), MatrixUtils.diagonal(m));
    }

    @Test
    void diagonalThrowsOnNonSquare() {
        var m = List.of(List.of(1, 2, 3), List.of(4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> MatrixUtils.diagonal(m));
    }

    @Test
    void diagonalSumArrayMatrixWorks() {
        int[][] m = {{1, 0}, {0, 4}};
        assertEquals(5, MatrixUtils.diagonalSum(m));
    }
}
