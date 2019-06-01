package model;

import java.util.ArrayList;
import java.util.List;

public class Player implements ILocalizable {

    private int horizontal;
    private int vertical;

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    private int currentGameBoard;
    private int ID;
    private String name;

    public int getCurrentGameBoard() {
        return currentGameBoard;
    }

    public void setCurrentGameBoard(int currentGameBoard) {
        this.currentGameBoard = currentGameBoard;
    }

    public Player(String name, int ID) {
        this.name = name;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public int getID() {
        return this.ID;
    }

    // region CollectibleItems

    private List<ColectibleItem> artifacts;

    public Player() {
        artifacts = new ArrayList<>();
    }

    public void collect(ColectibleItem item) {
        artifacts.add(item);
    }

    public String getArtifacts() {
        return artifacts.toString();
    }


    //endregion


    @Override
    public void setPosition(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;

    }


}
