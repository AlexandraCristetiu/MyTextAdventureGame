package sample;

import helper.ApplicationConstants;
import helper.SqliteWrapper;
import helper.Utility;
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

        Utility.createDirectory(ApplicationConstants.APP_FOLDER_DATA_PATH);
        SqliteWrapper sqliteWrapper = new SqliteWrapper();
        sqliteWrapper.createAllTables();
        launch(args);
    }
}
