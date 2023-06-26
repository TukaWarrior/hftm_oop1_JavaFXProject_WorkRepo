package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.Year;

public class GameNewController {

//Fields
    private Game game;
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

    @FXML
    private void initialize() {
        // Checks if any letters are entered and replaces them
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

        // Checks if any letters are entered and replaces them
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

        // Checks if any letters are entered and replaces them
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
    }

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

    @FXML
    private void onCancel(){
        App.switchToPrimaryView();
    }
}
