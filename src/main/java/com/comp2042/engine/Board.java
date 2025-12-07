package com.comp2042.engine;

import com.comp2042.events.ViewData;
import com.comp2042.models.ClearRow;
import com.comp2042.models.Score;

/**
 * Defines the public API for the game board, providing methods to control brick movement,
 * manage the board state, handle row clearing, and retrieve game data.
 */
public interface Board {

    /** Attempts to move the current falling brick one unit down. */
    boolean moveBrickDown();

    /** Attempts to move the current falling brick one unit left. */
    boolean moveBrickLeft();

    /** Attempts to move the current falling brick one unit right. */
    boolean moveBrickRight();

    /** Attempts to rotate the current falling brick one step to the left. */
    boolean rotateLeftBrick();

    /** Creates and spawns a new brick at the starting position. Returns true if the spawn immediately conflicts (Game Over). */
    boolean createNewBrick();

    /** Retrieves the current state of the board matrix, including all merged blocks. */
    int[][] getBoardMatrix();

    /** Retrieves a snapshot of all relevant data (brick position, shape, previews) for GUI rendering. */
    ViewData getViewData();

    /** Merges the currently falling brick into the background matrix. */
    void mergeBrickToBackground();

    /** Checks the background matrix for completed rows and removes them. */
    ClearRow clearRows();

    /** Retrieves the score object responsible for tracking points. */
    Score getScore();

    /** Resets the board and score, starting a new game instance. */
    void newGame();

    /** Calculates the ghost position and instantly moves the falling brick to that Y position. */
    void hardDropBrick();
}
