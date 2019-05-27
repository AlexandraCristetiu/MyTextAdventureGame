package helper;

public class ApplicationConstants {

    //region database
    public static final String APP_FOLDER_DATA_PATH = "C:\\Users\\Public\\Documents\\txtadvGame";

    private static final String PATH_SEPARATOR = "\\";


    public static final String DATABASE_NAME = "txtadvGame.db";
    public static final String DATABASE_FOLDER = "database";
    public static final String SQLITE_JDBC = "jdbc:sqlite";


    public static final String DB_CONNECTION_URL = SQLITE_JDBC + ":"
            + APP_FOLDER_DATA_PATH +
            PATH_SEPARATOR +
            DATABASE_FOLDER +
            PATH_SEPARATOR +
            DATABASE_NAME;

    //endregion


    // region table Game boards
    public static final String TABLE_GAME_BOARDS = "game_boards";
    public static final String TABLE_GAME_BOARDS_ID_COLUMN = "id";
    public static final String TABLE_GAME_BOARDS_NAME_COLUMN = "name";
    public static final String TABLE_GAME_BOARDS_SIZE_COLUMN = "board_size";
    // endregion



    //region table artifacts
      public static final String TABLE_GAME_ARTIFACTS="game_artifacts";
      public static final String TABLE_GAME_ARTIFACTS_ID_COLUMN="id";
      public static final String TABLE_GAME_ARTIFACTS_NAME_COLUMN="name";
      public static final String TABLE_GAME_ARTIFACTS_COLLECTIBLE_COLUMN="collectible";
    //endregion



    //region table artifacts_position
    public static final String TABLE_ARTIFACTS_POSITION="artifacts_position";
    public static final String TABLE_ARTIFACTS_HORIZONTAL_POSITION="horizontal";
    public static final String TABLE_ARTIFACTS_VERTICAL_POSITION="vertical";
    public static final String TABLE_ARTIFACTS_ID = "artifact_id";
    public static final String TABLE_ARTIFACTS_GAMEBOARD_ID="gameboard_id";
    //endregion



    // region table player
    public static final String TABLE_PLAYER_ID_COLUMN = "id";
    public static final String TABLE_PLAYER_NAME_COLUMN = "name";
    public static final String TABLE_PLAYERS = "players";
    public static final String TABLE_PLAYER_GAMEBOARD_ID = "gameboard_id";
    public static final String TABLE_PLAYER_HORIZONTAL = "horizontal";
    public static final String TABLE_PLAYER_VERTICAL = "vertical";
    public static final String TABLE_PLAYERS_NAME_COLUMN = "players";

    // endregion




}
