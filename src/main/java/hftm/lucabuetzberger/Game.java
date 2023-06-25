package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Game {
    private SimpleStringProperty gameTitle = new SimpleStringProperty();
    private SimpleStringProperty gameDeveloper = new SimpleStringProperty();
    private SimpleIntegerProperty gameReleaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty gameGenre = new SimpleStringProperty();
    private SimpleIntegerProperty gamePlaytime = new SimpleIntegerProperty();
    private SimpleIntegerProperty gameRating = new SimpleIntegerProperty();



    //Constructor
    public Game(){
    }

    public Game(String gameTitle, String gameDeveloper, int gameReleaseYear, String gameGenre, int gamePlaytime, int gameRating) {
        this.setGameTitle(gameTitle);
        this.setGameDeveloper(gameDeveloper);
        this.setGameReleaseYear(gameReleaseYear);
        this.setGameGenre(gameGenre);
        this.setGamePlaytime(gamePlaytime);
        this.setGameRating(gameRating);
    }

    // Game Title
    public SimpleStringProperty gameTitleProperty(){
        return this.gameTitle;
    }
    public String getGameTitle(){
        return this.gameTitle.get();
    }
    public void setGameTitle(String gameTitle){
        this.gameTitle.set(gameTitle);
    }

    // Game Developer
    public SimpleStringProperty gameDeveloperProperty(){
        return this.gameDeveloper;
    }
    public String getGameDeveloper(){
        return this.gameDeveloper.get();
    }
    public void setGameDeveloper(String gameDeveloper){
        this.gameDeveloper.set(gameDeveloper);
    }

    // Game ReleaseYear
    public SimpleIntegerProperty gameReleaseYearProperty(){
        return this.gameReleaseYear;
    }
    public Integer getGameReleaseYear(){
        return this.gameReleaseYear.get();
    }
    public void setGameReleaseYear(Integer gameReleaseYear){
        this.gameReleaseYear.set(gameReleaseYear);
    }

    // Game Genre
    public SimpleStringProperty gameGenreProperty(){
        return this.gameGenre;
    }
    public String getGameGenre(){
        return this.gameGenre.get();
    }
    public void setGameGenre(String gameGenre){
        this.gameGenre.set(gameGenre);
    }

    //Game Playtime
    public SimpleIntegerProperty gamePlaytimeProperty(){
        return this.gamePlaytime;
    }
    public Integer getGamePlaytime(){
        return this.gamePlaytime.get();
    }
    public void setGamePlaytime(Integer gamePlaytime){
        this.gamePlaytime.set(gamePlaytime);
    }

    //Game Rating
    public SimpleIntegerProperty gameRatingProperty(){
        return this.gameRating;
    }
    public Integer getGameRating(){
        return this.gameRating.get();
    }
    public void setGameRating(Integer gameRating){
        this.gameRating.set(gameRating);
    }
}
