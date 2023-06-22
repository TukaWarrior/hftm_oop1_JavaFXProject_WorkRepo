package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Movie {
    private SimpleStringProperty movieTitle = new SimpleStringProperty();
    private SimpleStringProperty movieDirector = new SimpleStringProperty();
    private SimpleIntegerProperty movieReleaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty movieGenre = new SimpleStringProperty();
    private SimpleIntegerProperty movieLength = new SimpleIntegerProperty();
    private SimpleIntegerProperty movieRating = new SimpleIntegerProperty();

    //Constructor
    public Movie(){
    }
    public Movie(String movieTitle, String movieDirector, int movieReleaseYear, String movieGenre, int movieLength, int movieRating) {
        this.setMovieTitle(movieTitle);
        this.setMovieDirector(movieDirector);
        this.setMovieReleaseYear(movieReleaseYear);
        this.setMovieGenre(movieGenre);
        this.setMovieLength(movieLength);
        this.setMovieRating(movieRating);
    }

    //Movie Title
    public SimpleStringProperty movieTitleProperty(){
        return this.movieTitle;
    }
    public String getMovieTitle(){
        return this.movieTitle.get();
    }
    public void setMovieTitle(String movieTitle){
        this.movieTitle.set(movieTitle);
    }

    //Movie Director
    public SimpleStringProperty movieDirectorProperty(){
        return this.movieDirector;
    }
    public String getMovieDirector(){
        return this.movieDirector.get();
    }
    public void setMovieDirector(String movieDirector){
        this.movieDirector.set(movieDirector);
    }

    //Movie Release Year
    public SimpleIntegerProperty movieReleaseYearProperty(){
        return this.movieReleaseYear;
    }
    public Integer getMovieReleaseYear(){
        return this.movieReleaseYear.get();
    }
    public void setMovieReleaseYear(Integer movieReleaseYear){
        this.movieReleaseYear.set(movieReleaseYear);
    }

    //Movie Genre
    public SimpleStringProperty movieGenreProperty(){
        return this.movieGenre;
    }
    public String getMovieGenre(){
        return this.movieGenre.get();
    }
    public void setMovieGenre(String movieGenre){
        this.movieGenre.set(movieGenre);
    }

    //Movie Length
    public SimpleIntegerProperty movieLengthProperty(){
        return this.movieLength;
    }
    public Integer getMovieLength(){
        return this.movieLength.get();
    }
    public void setMovieLength(Integer movieLength){
        this.movieLength.set(movieLength);
    }

    //Movie Rating
    public SimpleIntegerProperty movieRatingProperty(){
        return this.movieRating;
    }
    public Integer getMovieRating(){
        return this.movieRating.get();
    }
    public void setMovieRating(Integer movieRating){
        this.movieRating.set(movieRating);
    }
}
