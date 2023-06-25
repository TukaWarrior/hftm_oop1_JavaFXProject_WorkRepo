package hftm.lucabuetzberger;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

//JavaFX App
public class App extends Application {


//Observable List
    private static ObservableList<Book> bookList = FXCollections.observableArrayList();
    public static ObservableList<Book> getBookList() {
        return bookList;
    }
    private static ObservableList<Movie> movieList = FXCollections.observableArrayList();
    public static ObservableList<Movie> getMovieList() {
        return movieList;
    }

//Testing
    public App() {
        bookList.add(new Book("The Shining", "Steven King", 1998, "Horror", 447, 95));
        movieList.add(new Movie("The Lord of the Rings", "J. R. R. Tolkien", 2001, "Fantasy", 1178, 99));
    }

//Main Method
    public static void main(String[] args) {
        launch();
    }

//FXML Initialize Scene
    private static Scene scene;

//FXML Scene Start
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = createFXMLLoader("PrimaryView.fxml");
        App.scene = new Scene(loadFXML(fxmlLoader), 640, 480);
        stage.setTitle("I have no life");
        stage.setScene(scene);
        stage.show();
    }

//FXML Scene Change

    public static void switchToPrimaryView(){
        FXMLLoader fxmlLoader = createFXMLLoader("PrimaryView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }

    public static void switchToSecondaryView(){
        FXMLLoader fxmlLoader = createFXMLLoader("SecondaryView.fxml");
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

//FXML Loader
    private static FXMLLoader createFXMLLoader(String fxml)  {
        return new FXMLLoader(App.class.getResource("/" + fxml));
    }

    private static Parent loadFXML(FXMLLoader fxmlLoader)  {
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
    }

//Old COde
//    private static Parent loadFXML(String fxml) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/" + fxml + ".fxml"));
//        return fxmlLoader.load();
//    }

//    static void setSceneRoot(String fxml) throws IOException {
//        scene.setRoot(loadFXML(fxml));
//    }
}