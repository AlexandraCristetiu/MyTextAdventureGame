package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameBoard {
    private static int lastId = 0; // static field is incremented at each creation of a new GameBoard Object

    private int uniqueId; // id to uniquely identify a game board.

    private String boardName; // the name of the current "map" where a player can be at a time

    private int boardSize; // the game board will have an array of boardSize x boardSize

    private Object[][] gameBoardObjects; // the actual board where the artifacts/actors/player will rest

    // e.g. < gameBoard: "forest", id = 1, < 1 (horizontal), 2 (vertical) > >
    private Map<GameBoard, List<Integer>> connectedGameBoards;

    public GameBoard(String boardName, int boardSize) {
        this.boardName = boardName;
        this.boardSize = boardSize;
        gameBoardObjects = new Object[boardSize][boardSize];
        connectedGameBoards = new HashMap<>();
        uniqueId = lastId ++;
    }

    public void addConnectedBoard(GameBoard gameBoardForest, int i, int i1) {

    }

    public boolean placeOnBoard(Object obj, int horizontal, int vertical) {
        return false;
    }

    public Object removeFromBoard(int horizontal, int vertical) {
        return null;
    }

    public int artifactVerticalPosition(Artifact artifact) {
        return 0;
    }

    public int artifactHorizontalPosition(Artifact artifact) {
        return 0;
    }

    public int getUniqueId() {
        return 0;
    }
}
