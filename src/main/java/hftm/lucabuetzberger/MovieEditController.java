package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.time.Year;

public class MovieEditController {

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

    //region Populate TextFields
    public void setMovie(Movie movie) {
        this.movie = movie;
        //Fills the text fields with the selected instance
        txtf_movieTitle.setText(movie.getMovieTitle());
        txtf_movieDirector.setText(movie.getMovieDirector());
        txtf_movieReleaseYear.setText(String.valueOf(movie.getMovieReleaseYear()));
        txtf_movieGenre.setText(movie.getMovieGenre());
        txtf_movieLength.setText(String.valueOf(movie.getMovieLength()));
        txtf_movieRating.setText(String.valueOf(movie.getMovieRating()));
    }
    //endregion

    //region Button: Save
    @FXML
    private void onSave() {
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
        if (!genre.isEmpty()){
            this.movie.setMovieGenre(genre);
        }
        if (!length.isEmpty()){
            this.movie.setMovieLength(Integer.parseInt(length));
        }
        if (!rating.isEmpty()){
            this.movie.setMovieRating(Integer.parseInt(rating));
        }
        App.switchToPrimaryView();
    }
    //endregion

    //region Button: Cancel
    @FXML
    private void onCancel() {
        App.switchToPrimaryView();
    }
    //endregion
}
