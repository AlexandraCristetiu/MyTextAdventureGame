package model.gameData;

import helper.ConnectedGameBoardWrapper;
import helper.GameBoardWrapper;
import model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<GameBoard> gameBoards;
    private int currentBoardIndex;

    public Game() {
        gameBoards = new ArrayList<>();

        GameBoardWrapper gameBoardWrapper = new GameBoardWrapper();

        ConnectedGameBoardWrapper connectedGameBoardWrapper = new ConnectedGameBoardWrapper();

        GameBoard gameBoardForest = new GameBoard("forest", 10);

        gameBoards.add(gameBoardForest);

        gameBoardForest.addConnectedBoard(gameBoardForest, 10, 10);
        currentBoardIndex = 0;

        // region map_size


        if (board_size.contains("Small")) {
            Random random = new Random();
            int nr = random.nextInt(10) + 1;
            while (nr < 5) {
                nr = random.nextInt(10) + 1;
            }



        } else if (board_size.contains("Medium")) {
            Random random = new Random();
            int nr = random.nextInt(20) + 1;
            while (nr < 20 && nr > 10) {
                nr = random.nextInt(20) + 1;
            }


        } else {
            board_size.contains("Large");
            Random random = new Random();
            int nr = random.nextInt(30) + 1;
            while (nr < 30 && nr > 20) {
                nr = random.nextInt(30) + 1;
            }


        }

        //endregion
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

    public boolean movePlayer(Player player, int horizontal, int vertical, int gameBoardId ) {
        return true;
    }

    public void setCurrentBoardIndex(Object currentGameBoard) {

    }

    public void movePlayer(Player player, int horizontal, int i) {
    }
}
