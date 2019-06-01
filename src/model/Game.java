package model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<GameBoard> gameBoards;
    private int currentBoardIndex;

    public Game() {
        gameBoards = new ArrayList<>();

        GameBoard gameBoardForest = new GameBoard("forest", 10);

        gameBoards.add(gameBoardForest);

        gameBoardForest.addConnectedBoard(gameBoardForest, 10, 10);
        currentBoardIndex = 0;
    }

    public boolean placeOnBoard(Object obj, int horizontal, int vertical) {
        return gameBoards.get(currentBoardIndex).placeOnBoard(obj, horizontal, vertical);
    }

    public Object removeFromBoard(int horizontal, int vertical) {
        return gameBoards.get(currentBoardIndex).removeFromBoard(horizontal, vertical);
    }

    public String displayBoard() {
        return gameBoards.get(currentBoardIndex).toString();
    }

    public int getCurrentBoardIndex() {
        return currentBoardIndex;
    }

    public List<GameBoard> getGameBoards() {
        return gameBoards;
    }

    public boolean movePlayer(Player player, int horizontal, int vertical) {
        return true;
    }

}
