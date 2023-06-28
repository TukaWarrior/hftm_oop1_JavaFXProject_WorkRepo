package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.Year;

public class GameNewController {

    //region Fields
    private Game game;
    //endregion

    //region FXML Elements
    @FXML
    private TextField txtf_gameTitle;
    @FXML
    private TextField txtf_gameDeveloper;
    @FXML
    private TextField txtf_gameReleaseYear;
    @FXML
    private TextField txtf_gameGenre;
    @FXML
    private TextField txtf_gamePlaytime;
    @FXML
    private TextField txtf_gameRating;
    //endregion

    @FXML
    private void initialize() {

        //region Text Input Constraints: txtf_gamePlaytime
        //Checks if any letters are entered and replaces them
        txtf_gamePlaytime.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_gamePlaytime.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 1000000) {
                    txtf_gamePlaytime.setText(oldValue);
                }
            }
        });
        //endregion

        //region Text Input Constraints: txtf_gameReleaseYear
        //Checks if any letters are entered and replaces them
        txtf_gameReleaseYear.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_gameReleaseYear.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 0 || rating > Year.now().getValue()) {
                    txtf_gameReleaseYear.setText(oldValue);
                }
            }
        });
        //endregion

        //region Text Input Constraints: txtf_gameRating
        //Checks if any letters are entered and replaces them
        txtf_gameRating.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_gameRating.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 100) {
                    txtf_gameRating.setText(oldValue);
                }
            }
        });
        //endregion
    }

    //region Button: Save
    @FXML
    private void onSave() {
        this.game = new Game();
        String title = txtf_gameTitle.getText();
        String developer = txtf_gameDeveloper.getText();
        String releaseYear = txtf_gameReleaseYear.getText();
        String genre = txtf_gameGenre.getText();
        String playtime = txtf_gamePlaytime.getText();
        String rating = txtf_gameRating.getText();

        if (!title.isEmpty()){
            this.game.setGameTitle(title);
        }
        if (!developer.isEmpty()){
            this.game.setGameDeveloper(developer);
        }
        if (!releaseYear.isEmpty()){
            this.game.setGameReleaseYear(Integer.parseInt(releaseYear));
        }
        if (!developer.isEmpty()){
            this.game.setGameGenre(genre);
        }
        if (!playtime.isEmpty()){
            this.game.setGamePlaytime(Integer.parseInt(playtime));
        }
        if (!rating.isEmpty()){
            this.game.setGameRating(Integer.parseInt(rating));
        }
        App.getGameList().add(game);
        App.switchToPrimaryView();
    }
    //endregion

    //region Button: Cancel
    @FXML
    private void onCancel(){
        App.switchToPrimaryView();
    }
    //endregion
}
