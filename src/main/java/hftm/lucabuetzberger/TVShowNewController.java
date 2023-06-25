package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.Year;


public class TVShowNewController {

    //Fields
    private TVShow tvshow;
    @FXML
    private TextField txtf_tvshowTitle;
    @FXML
    private TextField txtf_tvshowDirector;
    @FXML
    private TextField txtf_tvshowReleaseYear;
    @FXML
    private TextField txtf_tvshowGenre;
    @FXML
    private TextField txtf_tvshowEpisodes;
    @FXML
    private TextField txtf_tvshowRating;

    @FXML
    private void initialize() {
        // Checks if any letters are entered and replaces them
        txtf_tvshowEpisodes.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_tvshowEpisodes.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 1000000) {
                    txtf_tvshowEpisodes.setText(oldValue);
                }
            }
        });

        // Checks if any letters are entered and replaces them
        txtf_tvshowReleaseYear.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_tvshowReleaseYear.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 0 || rating > Year.now().getValue()) {
                    txtf_tvshowReleaseYear.setText(oldValue);
                }
            }
        });

        // Checks if any letters are entered and replaces them
        txtf_tvshowRating.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_tvshowRating.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 100) {
                    txtf_tvshowRating.setText(oldValue);
                }
            }
        });
    }

    @FXML
    private void onSave() {
        this.tvshow = new TVShow();
        String title = txtf_tvshowTitle.getText();
        String director = txtf_tvshowDirector.getText();
        String releaseYear = txtf_tvshowReleaseYear.getText();
        String genre = txtf_tvshowGenre.getText();
        String episodes = txtf_tvshowEpisodes.getText();
        String rating = txtf_tvshowRating.getText();

        if (!title.isEmpty()){
            this.tvshow.setTVShowTitle(title);
        }
        if (!director.isEmpty()){
            this.tvshow.setTVShowDirector(director);
        }
        if (!releaseYear.isEmpty()){
            this.tvshow.setTVShowReleaseYear(Integer.parseInt(releaseYear));
        }
        if (!director.isEmpty()){
            this.tvshow.setTVShowGenre(genre);
        }
        if (!episodes.isEmpty()){
            this.tvshow.setTVShowEpisodes(Integer.parseInt(episodes));
        }
        if (!rating.isEmpty()){
            this.tvshow.setTVShowRating(Integer.parseInt(rating));
        }
        App.getTVShowList().add(tvshow);
        App.switchToPrimaryView();
    }

    @FXML
    private void onCancel(){
        App.switchToPrimaryView();
    }
}
