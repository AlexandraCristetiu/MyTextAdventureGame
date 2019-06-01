package sample;

import helper.*;

import javafx.scene.control.ComboBox;
import model.*;
import model.Artifact;

import java.awt.*;
import java.util.List;
import java.util.Map;


public class Controller {

    private Game game;
    private Player player;

    public TextArea txtAreaGameOutput;

    public void initialize() {
        //tabPane.getSelectionModel().select(tabGame);
        game = new Game();


        List<Artifact> artifacts = new ArtifactWrapper().getAllArtifacts();
        Map<Integer, List<Integer>> artifactsPositions =
                new ArtifactPositionWrapper().getAllArtifactsPositions();
        if (artifacts.size() == 0) {
            Key key = new Key();
            Door door = new Door(key);

            game.placeOnBoard(key, 2, 3);
            game.placeOnBoard(door, 1, 5);

        } else {
            for (Artifact artifact : artifacts
            ) {
                game.placeOnBoard(artifact,
                        artifactsPositions.get(artifact.getId()).get(1),
                        artifactsPositions.get(artifact.getId()).get(0));
            }
        }

        List<Player> players = new PlayerWrapper().getAllPlayers();
        if (players.size() == 0) {

            player = new Player();
            game.placeOnBoard(player, 5, 5);
        } else {

            player = players.get(0);
            // only one player in database
            // player.setPosition(players.get(0).getHorizontal(), players.get(0).getVertical());
            game.setCurrentBoardIndex(player.getCurrentGameBoard());
            game.placeOnBoard(player, player.getHorizontal(),
                    player.getVertical());
        }

        System.out.println(game.displayBoard());

        txtAreaGameOutput.appendText(game.displayBoard() + "\n");
    }

    public ComboBox cmbboxMapSizeMapGenerator;

    //region insert_map_size_cmbbox

    private void updateCombobox(ComboBox comboboxCategories) {
        comboboxCategories.getItems().clear();

        try {
            if (false) {
                comboboxCategories.getItems().addAll(
                        ApplicationConstants.APP_FOLDER_DATA_PATH +
                                "\\"
                                + ApplicationConstants.TABLE_GAME_BOARDS_SIZE_COLUMN);
            }

            SqliteWrapper sqliteWrapper = new SqliteWrapper() {
                @Override
                public void createTable() {

                }
            };
            comboboxCategories.getItems().addAll(sqliteWrapper.getAllSizes());
        } catch (Exception e) {
        }
    }
    //end region


}
