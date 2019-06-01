package helper;

import model.Artifact;
import model.GameBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArtifactPositionWrapper {
    public void createTable() {
createArtifactPosition();

    }

    private void createArtifactPosition() {

    }
    public void insert(Artifact artifact, GameBoard gameBoard) {
        String sql = "INSERT INTO " + ApplicationConstants.TABLE_ARTIFACTS_POSITION +
                "("
                + ApplicationConstants.TABLE_ARTIFACTS_ID + "," +
                ApplicationConstants.TABLE_ARTIFACTS_HORIZONTAL_POSITION + "," +
                ApplicationConstants.TABLE_ARTIFACTS_VERTICAL_POSITION + "," +
                ApplicationConstants.TABLE_ARTIFACTS_GAMEBOARD_ID + ")" +
                " VALUES(?,?,?,?);";
        try {
            Connection conn = this.connect();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, artifact.getId());
            statement.setInt(2, gameBoard.artifactVerticalPosition(artifact));
            statement.setInt(3, gameBoard.artifactHorizontalPosition(artifact));
            statement.setInt(4, gameBoard.getUniqueId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private Connection connect() {
        return null;
    }
}
