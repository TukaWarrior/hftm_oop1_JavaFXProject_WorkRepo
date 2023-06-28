package hftm.lucabuetzberger;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    //region Observable List
    private static ObservableList<Book> bookList = FXCollections.observableArrayList();
    public static ObservableList<Book> getBookList() {
        return bookList;
    }
    private static ObservableList<Movie> movieList = FXCollections.observableArrayList();
    public static ObservableList<Movie> getMovieList() {
        return movieList;
    }
    private static ObservableList<Game> gameList = FXCollections.observableArrayList();
    public static ObservableList<Game> getGameList() {
        return gameList;
    }
    private static ObservableList<TVShow> tvshowList = FXCollections.observableArrayList();
    public static ObservableList<TVShow> getTVShowList() {
        return tvshowList;
    }
    //endregion

    //region Object Instances
    public App() {
        bookList.add(new Book("The Shining", "Steven King", 1998, "Horror", 447, 86));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Roman", 281, 95));
        bookList.add(new Book("1984", "George Orwell", 1949, "Dystopisch", 328, 92));

        movieList.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien", 2001, "Fantasy", 178, 92));
        movieList.add(new Movie("Back to the Future", "Robert Zemeckis", 1985, "Sci-Fi", 116, 87));
        movieList.add(new Movie("Forrest Gump", "Robert Zemeckis", 1994, "Drama", 142, 88));

        gameList.add(new Game("The Legend of Zelda: Ocarina of Time", "Nintendo EAD", 1998, "Action-Adventure", 39, 99));
        gameList.add(new Game("Metroid Prime", "Retro Studios", 2002, "Metroidvania", 17, 97));
        gameList.add(new Game("Outer Wilds", "Mobius Digital", 2019, "Exploration", 26, 100));

        tvshowList.add(new TVShow("The Expanse", "Mark Fergus", 2016, "Sci-Fi", 10, 85));
        tvshowList.add(new TVShow("The Boys", "Eric Kripk", 2016, "Superhero", 24, 87));
        tvshowList.add(new TVShow("Final Space", "Olan Rogers", 2018, "Comedy", 36, 95));
    }
    //endregion

    //region Main Method
    public static void main(String[] args) {
        launch();
    }
    //endregion

    //region FXML Loader
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = createFXMLLoader("PrimaryView.fxml");
        App.scene = new Scene(loadFXML(fxmlLoader), 640, 480);
        stage.setTitle("Entertainment Tracker");
        stage.setScene(scene);
        stage.show();
    }

    private static FXMLLoader createFXMLLoader(String fxml) {
        return new FXMLLoader(App.class.getResource("/" + fxml));
    }

    private static Parent loadFXML(FXMLLoader fxmlLoader) {
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
    }
    //endregion

    //region FXML Scene Change
    public static void switchToPrimaryView(){
        FXMLLoader fxmlLoader = createFXMLLoader("PrimaryView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }
    public static void switchToNewBookView(){
        FXMLLoader fxmlLoader = createFXMLLoader("BookNewView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }
    public static void switchToBookEditView(Book selectedBook) {
        FXMLLoader fxmlLoader = createFXMLLoader("BookEditView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
        BookEditController controller = fxmlLoader.getController();
        controller.setBook(selectedBook);
    }
    public static void switchToNewMovieView(){
        FXMLLoader fxmlLoader = createFXMLLoader("MovieNewView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }
    public static void switchToMovieEditView(Movie selectedMovie) {
        FXMLLoader fxmlLoader = createFXMLLoader("MovieEditView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
        MovieEditController controller = fxmlLoader.getController();
        controller.setMovie(selectedMovie);
    }
    public static void switchToNewGameView(){
        FXMLLoader fxmlLoader = createFXMLLoader("GameNewView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }
    public static void switchToGameEditView(Game selectedGame) {
        FXMLLoader fxmlLoader = createFXMLLoader("GameEditView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
        GameEditController controller = fxmlLoader.getController();
        controller.setGame(selectedGame);
    }
    public static void switchToNewTVShowView(){
        FXMLLoader fxmlLoader = createFXMLLoader("TVShowNewView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }
    public static void switchToTVShowEditView(TVShow selectedTVShow) {
        FXMLLoader fxmlLoader = createFXMLLoader("TVShowEditView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
        TVShowEditController controller = fxmlLoader.getController();
        controller.setTVShow(selectedTVShow);
    }
    //endregion
}