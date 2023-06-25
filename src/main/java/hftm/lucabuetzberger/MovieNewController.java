package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.time.Year;

public class MovieNewController {

    //Fields
    private Movie movie;
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

    @FXML
    private void initialize() {
        // Checks if any letters are entered and replaces them
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

        // Checks if any letters are entered and replaces them
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

        // Checks if any letters are entered and replaces them
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
    }

    @FXML
    private void onSave() {
        this.movie = new Movie();
        String title = txtf_movieTitle.getText();
        String author = txtf_movieDirector.getText();
        String releaseYear = txtf_movieReleaseYear.getText();
        String genre = txtf_movieGenre.getText();
        String pages = txtf_movieLength.getText();
        String rating = txtf_movieRating.getText();

        if (!title.isEmpty()){
            this.movie.setMovieTitle(title);
        }
        if (!author.isEmpty()){
            this.movie.setMovieDirector(author);
        }
        if (!releaseYear.isEmpty()){
            this.movie.setMovieReleaseYear(Integer.parseInt(releaseYear));
        }
        if (!author.isEmpty()){
            this.movie.setMovieGenre(genre);
        }
        if (!pages.isEmpty()){
            this.movie.setMovieLength(Integer.parseInt(pages));
        }
        if (!rating.isEmpty()){
            this.movie.setMovieRating(Integer.parseInt(rating));
        }
        App.getMovieList().add(movie);
        App.switchToPrimaryView();
    }

    @FXML
    private void onCancel(){
        App.switchToPrimaryView();
    }
}
