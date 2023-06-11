package hftm.lucabuetzberger;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    // Java Stuff
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    // Observable List Stuff
    private static ObservableList<Book> bookList = FXCollections.observableArrayList();

    public App() {
		bookList.add(new Book("The Shining","Steven King", 447, 9.5));
        bookList.add(new Book("The Lord of the Rings","J. R. R. Tolkien", 1178, 9.9));
	}

    public static ObservableList<Book> getBookList() {
		return bookList;
	}

    // FXML Stuff
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setSceneRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

}