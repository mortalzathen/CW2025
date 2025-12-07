package com.comp2042.models;

import com.comp2042.util.MatrixOperations;

/**
 * Data transfer object (DTO) containing the results of a row-clearing operation,
 * including the number of lines removed, the resulting matrix, and the calculated score bonus.
 */
public final class ClearRow {

    private final int linesRemoved;
    private final int[][] newMatrix;
    private final int scoreBonus;

    public ClearRow(int linesRemoved, int[][] newMatrix, int scoreBonus) {
        this.linesRemoved = linesRemoved;
        this.newMatrix = newMatrix;
        this.scoreBonus = scoreBonus;
    }

    /**
     * @return The total number of full lines removed in the last operation.
     */
    public int getLinesRemoved() {
        return linesRemoved;
    }

    public int[][] getNewMatrix() {
        return MatrixOperations.copy(newMatrix);
    }

    /**
     * @return The calculated score bonus for the lines cleared.
     */
    public int getScoreBonus() {
        return scoreBonus;
    }
}
