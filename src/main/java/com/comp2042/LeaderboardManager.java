package com.comp2042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderboardManager {

    private static final List<ScoreEntry> scores = new ArrayList<>();

    private static final int MAX_ENTRIES = 10;

    public static void addScore(String playerName, int score) {
        scores.add(new ScoreEntry(playerName, score));
        sortAndTrim();
    }

    private static void sortAndTrim() {
        Collections.sort(scores);

        if (scores.size() > MAX_ENTRIES) {
            scores.subList(MAX_ENTRIES, scores.size()).clear();
        }
    }

    public static List<ScoreEntry> getTopScores() {
        return new ArrayList<>(scores);
    }
}