package com.comp2042.models;

import java.io.Serializable;

/**
 * Data structure representing a single high score record. Implements Serializable
 * for persistence and Comparable for sorting in the leaderboard.
 */
public class ScoreEntry implements Comparable<ScoreEntry>, Serializable {
    private static final long serialVersionUID = 1L;

    private final String playerName;
    private final int score;

    /**
     * Constructs a new ScoreEntry.
     * @param playerName The name of the player.
     * @param score The achieved score.
     */
    public ScoreEntry(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    /**
     * @return The player's name.
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @return The score value.
     */
    public int getScore() {
        return score;
    }

    /**
     * Compares this entry with another based on score for descending order sorting.
     * @param other The other ScoreEntry to compare against.
     * @return A negative integer, zero, or a positive integer as this score is greater than, equal to, or less than the specified object's score.
     */
    @Override
    public int compareTo(ScoreEntry other) {
        return Integer.compare(other.score, this.score);
    }
}