package com.comp2042.events;

/**
 * Interface defining the contract for handling all user input and timed events (down, left, right, rotate).
 * This acts as the bridge between the UI (GuiController) and the game logic (GameController).
 */
public interface InputEventListener {

    /** Handles the down movement event. */
    DownData onDownEvent(MoveEvent event);

    /** Handles the left movement event. */
    ViewData onLeftEvent(MoveEvent event);

    /** Handles the right movement event. */
    ViewData onRightEvent(MoveEvent event);

    /** Handles the rotation event. */
    ViewData onRotateEvent(MoveEvent event);

    /** Handles the instant hard drop movement event. */
    void onHardDropEvent();

    /** Signals the game engine to reset the game state and start a new game. */
    void createNewGame();
}
