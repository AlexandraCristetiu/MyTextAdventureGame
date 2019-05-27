package sample;

import helper.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Test Adventure Game");
        primaryStage.setScene(new Scene(root, 800, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {

        PlayerWrapper playerWrapper = new PlayerWrapper();
        GameBoardWrapper gameBoardWrapper = new GameBoardWrapper();
        ArtifactPositionWrapper artifactPositionWrapper = new ArtifactPositionWrapper();
        ArtifactWrapper artifactWrapper = new ArtifactWrapper();
        playerWrapper.createTable();
        gameBoardWrapper.createTable();
        artifactPositionWrapper.createTable();
        artifactWrapper.createTable();

        launch(args);
    }
}
