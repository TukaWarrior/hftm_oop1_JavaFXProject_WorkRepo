package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TVShow {
    private SimpleStringProperty tvShowTitle = new SimpleStringProperty();
    private SimpleStringProperty tvShowDirector = new SimpleStringProperty();
    private SimpleIntegerProperty tvShowReleaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty tvShowGenre = new SimpleStringProperty();
    private SimpleIntegerProperty tvShowEpisodes = new SimpleIntegerProperty();
    private SimpleIntegerProperty tvShowRating = new SimpleIntegerProperty();

    //Constructor
    public TVShow(){
    }

    public TVShow(String tvShowTitle, String tvShowDirector, int tvShowReleaseYear, String tvShowGenre, int tvShowEpisodes, int tvShowRating){
        this.setTVShowTitle(tvShowTitle);
        this.setTVShowDirector(tvShowDirector);
        this.setTVShowReleaseYear(tvShowReleaseYear);
        this.setTVShowGenre(tvShowGenre);
        this.setTVShowLength(tvShowEpisodes);
        this.setTVShowRating(tvShowRating);
    }

    // TVShow Title
    public SimpleStringProperty tvShowTitleProperty(){
        return this.tvShowTitle;
    }
    public String getTVShowTitle(){
        return this.tvShowTitle.get();
    }
    public void setTVShowTitle(String tvShowTitle){
        this.tvShowTitle.set(tvShowTitle);
    }

    // TVShow Director
    public SimpleStringProperty tvShowDirectorProperty(){
        return this.tvShowDirector;
    }
    public String getTVShowDirector(){
        return this.tvShowDirector.get();
    }
    public void setTVShowDirector(String tvShowDirector){
        this.tvShowDirector.set(tvShowDirector);
    }

    // TVShow ReleaseYear
    public SimpleIntegerProperty tvShowReleaseYearProperty(){
        return this.tvShowReleaseYear;
    }
    public Integer getTVShowReleaseYear(){
        return this.tvShowReleaseYear.get();
    }
    public void setTVShowReleaseYear(Integer tvShowReleaseYear){
        this.tvShowReleaseYear.set(tvShowReleaseYear);
    }

    // TVShow Genre
    public SimpleStringProperty tvShowGenreProperty(){
        return this.tvShowGenre;
    }
    public String getTVShowGenre(){
        return this.tvShowGenre.get();
    }
    public void setTVShowGenre(String tvShowGenre){
        this.tvShowGenre.set(tvShowGenre);
    }

    // TVShow Length
    public SimpleIntegerProperty tvShowLengthProperty(){
        return this.tvShowEpisodes;
    }
    public Integer getTVShowEpisodes(){
        return this.tvShowEpisodes.get();
    }
    public void setTVShowLength(Integer tvShowEpisodes){
        this.tvShowEpisodes.set(tvShowEpisodes);
    }

    // TVShow Rating
    public SimpleIntegerProperty tvShowRatingProperty(){
        return this.tvShowRating;
    }
    public Integer getTVShowRating(){
        return this.tvShowRating.get();
    }
    public void setTVShowRating(Integer tvShowRating){
        this.tvShowRating.set(tvShowRating);
    }
}
