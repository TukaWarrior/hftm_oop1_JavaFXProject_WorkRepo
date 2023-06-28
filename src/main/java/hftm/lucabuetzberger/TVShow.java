package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TVShow {

    //region Fields
    private SimpleStringProperty tvshowTitle = new SimpleStringProperty();
    private SimpleStringProperty tvshowDirector = new SimpleStringProperty();
    private SimpleIntegerProperty tvshowReleaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty tvshowGenre = new SimpleStringProperty();
    private SimpleIntegerProperty tvshowEpisodes = new SimpleIntegerProperty();
    private SimpleIntegerProperty tvshowRating = new SimpleIntegerProperty();
    //endregion

    //region Constructors
    public TVShow(){
    }
    public TVShow(String tvshowTitle, String tvshowDirector, int tvshowReleaseYear, String tvshowGenre, int tvshowEpisodes, int tvshowRating){
        this.setTVShowTitle(tvshowTitle);
        this.setTVShowDirector(tvshowDirector);
        this.setTVShowReleaseYear(tvshowReleaseYear);
        this.setTVShowGenre(tvshowGenre);
        this.setTVShowEpisodes(tvshowEpisodes);
        this.setTVShowRating(tvshowRating);
    }
    //endregion

    //region Attribute TVShow Title
    public SimpleStringProperty tvshowTitleProperty(){
        return this.tvshowTitle;
    }
    public String getTVShowTitle(){
        return this.tvshowTitle.get();
    }
    public void setTVShowTitle(String tvShowTitle){
        this.tvshowTitle.set(tvShowTitle);
    }
    //endregion

    //region Attribute TVShow Director
    public SimpleStringProperty tvshowDirectorProperty(){
        return this.tvshowDirector;
    }
    public String getTVShowDirector(){
        return this.tvshowDirector.get();
    }
    public void setTVShowDirector(String tvShowDirector){
        this.tvshowDirector.set(tvShowDirector);
    }
    //endregion

    //region Attribute TVShow ReleaseYear
    public SimpleIntegerProperty tvshowReleaseYearProperty(){
        return this.tvshowReleaseYear;
    }
    public Integer getTVShowReleaseYear(){
        return this.tvshowReleaseYear.get();
    }
    public void setTVShowReleaseYear(Integer tvShowReleaseYear){
        this.tvshowReleaseYear.set(tvShowReleaseYear);
    }
    //endregion

    //region Attribute TVShow Genre
    public SimpleStringProperty tvshowGenreProperty(){
        return this.tvshowGenre;
    }
    public String getTVShowGenre(){
        return this.tvshowGenre.get();
    }
    public void setTVShowGenre(String tvShowGenre){
        this.tvshowGenre.set(tvShowGenre);
    }
    //endregion

    //region Attribute TVShow Length
    public SimpleIntegerProperty tvshowEpisodesProperty(){
        return this.tvshowEpisodes;
    }
    public Integer getTVShowEpisodes(){
        return this.tvshowEpisodes.get();
    }
    public void setTVShowEpisodes(Integer tvShowEpisodes){
        this.tvshowEpisodes.set(tvShowEpisodes);
    }
    //endregion

    //region Attribute TVShow Rating
    public SimpleIntegerProperty tvshowRatingProperty(){
        return this.tvshowRating;
    }
    public Integer getTVShowRating(){
        return this.tvshowRating.get();
    }
    public void setTVShowRating(Integer tvShowRating){
        this.tvshowRating.set(tvShowRating);
    }
    //endregion

    //region All TVShow attributes (for sorting function)
    public String getTVShowAttributes() {
        StringBuilder attributes = new StringBuilder();
        attributes.append(tvshowTitle.get()).append(" ");
        attributes.append(tvshowDirector.get()).append(" ");
        attributes.append(tvshowReleaseYear.get()).append(" ");
        attributes.append(tvshowGenre.get()).append(" ");
        attributes.append(tvshowEpisodes.get()).append(" ");
        attributes.append(tvshowRating.get());
        return attributes.toString().toLowerCase();
    }
    //endregion
}