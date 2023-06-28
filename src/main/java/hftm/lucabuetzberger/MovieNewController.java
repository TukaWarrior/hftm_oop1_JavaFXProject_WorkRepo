package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.time.Year;


public class MovieNewController {

    //region Fields
    private Movie movie;
    //endregion

    //region FXML Elements
    @FXML
    private TextField txtf_movieTitle;
    @FXML
    private TextField txtf_movieDirector;
    @FXML
    private TextField txtf_movieReleaseYear;
    @FXML
    private TextField txtf_movieGenre;
    @FXML
    private TextField txtf_movieLength;
    @FXML
    private TextField txtf_movieRating;
    //endregion

    @FXML
    private void initialize() {

        //region Text Input Constraints: txtf_movieLength
        //Checks if any letters are entered and replaces them
        txtf_movieLength.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_movieLength.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 1000000) {
                    txtf_movieLength.setText(oldValue);
                }
            }
        });
        //endregion

        //region Text Input Constraints: txtf_movieReleaseYear
        //Checks if any letters are entered and replaces them
        txtf_movieReleaseYear.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_movieReleaseYear.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 0 || rating > Year.now().getValue()) {
                    txtf_movieReleaseYear.setText(oldValue);
                }
            }
        });
        //endregion

        //region Text Input Constraints: txtf_movieRating
        //Checks if any letters are entered and replaces them
        txtf_movieRating.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_movieRating.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 100) {
                    txtf_movieRating.setText(oldValue);
                }
            }
        });
        //endregion
    }

    //region Button: Save
    @FXML
    private void onSave() {
        this.movie = new Movie();
        String title = txtf_movieTitle.getText();
        String director = txtf_movieDirector.getText();
        String releaseYear = txtf_movieReleaseYear.getText();
        String genre = txtf_movieGenre.getText();
        String length = txtf_movieLength.getText();
        String rating = txtf_movieRating.getText();

        if (!title.isEmpty()){
            this.movie.setMovieTitle(title);
        }
        if (!director.isEmpty()){
            this.movie.setMovieDirector(director);
        }
        if (!releaseYear.isEmpty()){
            this.movie.setMovieReleaseYear(Integer.parseInt(releaseYear));
        }
        if (!director.isEmpty()){
            this.movie.setMovieGenre(genre);
        }
        if (!length.isEmpty()){
            this.movie.setMovieLength(Integer.parseInt(length));
        }
        if (!rating.isEmpty()){
            this.movie.setMovieRating(Integer.parseInt(rating));
        }
        App.getMovieList().add(movie);
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
