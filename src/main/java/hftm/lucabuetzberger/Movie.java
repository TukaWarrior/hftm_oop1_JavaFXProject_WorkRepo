package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Movie {

    //region Fields
    private SimpleStringProperty movieTitle = new SimpleStringProperty();
    private SimpleStringProperty movieDirector = new SimpleStringProperty();
    private SimpleIntegerProperty movieReleaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty movieGenre = new SimpleStringProperty();
    private SimpleIntegerProperty movieLength = new SimpleIntegerProperty();
    private SimpleIntegerProperty movieRating = new SimpleIntegerProperty();
    //endregion

    //region Constructors
    public Movie() {
    }
    public Movie(String movieTitle, String movieDirector, int movieReleaseYear, String movieGenre, int movieLength, int movieRating) {
        this.setMovieTitle(movieTitle);
        this.setMovieDirector(movieDirector);
        this.setMovieReleaseYear(movieReleaseYear);
        this.setMovieGenre(movieGenre);
        this.setMovieLength(movieLength);
        this.setMovieRating(movieRating);
    }
    //endregion

    //region Attribute Movie Title
    public SimpleStringProperty movieTitleProperty() {
        return this.movieTitle;
    }
    public String getMovieTitle() {
        return this.movieTitle.get();
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle.set(movieTitle);
    }
    //endregion

    //region Attribute Movie Director
    public SimpleStringProperty movieDirectorProperty() {
        return this.movieDirector;
    }
    public String getMovieDirector() {
        return this.movieDirector.get();
    }
    public void setMovieDirector(String movieDirector) {
        this.movieDirector.set(movieDirector);
    }
    //endregion

    //region Attribute Movie Release Year
    public SimpleIntegerProperty movieReleaseYearProperty() {
        return this.movieReleaseYear;
    }
    public Integer getMovieReleaseYear() {
        return this.movieReleaseYear.get();
    }
    public void setMovieReleaseYear(Integer movieReleaseYear) {
        this.movieReleaseYear.set(movieReleaseYear);
    }
    //endregion

    //region Attribute Movie Genre
    public SimpleStringProperty movieGenreProperty() {
        return this.movieGenre;
    }
    public String getMovieGenre() {
        return this.movieGenre.get();
    }
    public void setMovieGenre(String movieGenre) {
        this.movieGenre.set(movieGenre);
    }
    //endregion

    //region Attribute Movie Length
    public SimpleIntegerProperty movieLengthProperty() {
        return this.movieLength;
    }
    public Integer getMovieLength() {
        return this.movieLength.get();
    }
    public void setMovieLength(Integer movieLength) {
        this.movieLength.set(movieLength);
    }
    //endregion

    //region Attribute Movie Rating
    public SimpleIntegerProperty movieRatingProperty() {
        return this.movieRating;
    }
    public Integer getMovieRating() {
        return this.movieRating.get();
    }
    public void setMovieRating(Integer movieRating) {
        this.movieRating.set(movieRating);
    }
    //endregion

    //region All Movie attributes (for sorting function)
    public String getMovieAttributes() {
        StringBuilder attributes = new StringBuilder();
        attributes.append(movieTitle.get()).append(" ");
        attributes.append(movieDirector.get()).append(" ");
        attributes.append(movieReleaseYear.get()).append(" ");
        attributes.append(movieGenre.get()).append(" ");
        attributes.append(movieLength.get()).append(" ");
        attributes.append(movieRating.get());
        return attributes.toString().toLowerCase();
    }
    //endregion
}