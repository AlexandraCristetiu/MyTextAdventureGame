package sample;

import helper.*;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import model.*;
import model.Artifact;
import model.gameData.Game;

import java.awt.*;
import java.util.List;
import java.util.Map;


public class Controller {

    //region ButtonsAndTabs

    // region GameTab
    public TabPane gameTab;

    //endregion
    //region MapsTab
    public Tab tabMaps;
    public javafx.scene.control.Button btnOpenMapEditor;
    public javafx.scene.control.Button btnOpenMapGenerator;
    public javafx.scene.control.Label lblChooseMapAction;
    //endregion

    //region MapGenerator
    public Tab tabMapGenerator;
    public javafx.scene.control.Button btnGenerateNewMap;
    public javafx.scene.control.Label lblInsertMapNameMapGenerator;
    public javafx.scene.control.Label lblChooseMapSizeMapGenerator;
    public javafx.scene.control.TextField txtboxInsertMapNameMapGenerator;
    public javafx.scene.control.Label lblArtifactNameMapGenerator;
    public javafx.scene.control.Label lblArtifactTypeGameGenerator;
    public ComboBox cmbboxArtifactTypeMapGenerator;
    public javafx.scene.control.Label lblArtifactDetailsMapGenerator;
    public javafx.scene.control.Label lblMapDetailsMapGenerator;
    public javafx.scene.control.Label lblNbofArtifactsMapGenerator;
    public javafx.scene.control.TextField txtboxNumberOfArtifactsMapGenerator;
    public ComboBox cmbboxArtifactNameMapGenerator;
    //endregion

    //region MapEditor
    public Tab tabMapEditor;
    public javafx.scene.control.Label lblMapNameMapEditor;
    public ComboBox cmbboxMapNameMapEditor;
    public javafx.scene.control.Label lblMapSizeMapEditor;
    public ComboBox cmbboxMapSizeMapEditor;
    public javafx.scene.control.Label lblArtifactNameMapEditor;
    public ComboBox cmbboxArtifactNameMapEditor;
    public javafx.scene.control.Label lblArtifactTypeMapEditor;
    public ComboBox cmbboxArtifactTypeMapEditor;
    public javafx.scene.control.Label lblNbOfArtifactsMapEditor;
    public javafx.scene.control.TextField txtboxNumberOfArtifactsMapEditor;
    public javafx.scene.control.Button btnUpdateExistingMap;
    public javafx.scene.control.Label lblArtifactDetailsMapEditor;
    public javafx.scene.control.Label lblMapDetailsMapEditor;
// endregion

    //endregion


    private Game game;
    private Player player;

    public TextArea txtAreaGameOutput;
    public ComboBox cmbboxMapSizeMapGenerator;


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


// region EditMapBtn

    //public void
    //endregion
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

    public void initializeMap(MouseEvent mouseEvent) {

    }

    public void doOpenExistingMaps(ActionEvent actionEvent) {
        if (btnOpenMapEditor.getText().equals(ApplicationConstants.BTN_MAP_EDITOR)) {

            //correct username and password
            if ((Boolean) btnOpenMapEditor.isPressed(tabMapEditor) {


                // add tab categories
                gameTab.getTabs().add(tabMapEditor);
                //activate tab categories
                gameTab.getTabs().getSelectionModel().select(tabMapEditor);


        if (actionEvent.getSource().equals(doOpenExistingMaps)) {

            if (!gameTab.getTabs().contains(tabMapEditor)) {
                gameTab.getTabs().add(tabMapEditor);
            }
            gameTab.getSelectionModel().select(tabMapEditor);
            btnOpenMapEditor.setText(ApplicationConstants.BTN_MAP_EDITOR);
        }
    }
    //endregion


}
