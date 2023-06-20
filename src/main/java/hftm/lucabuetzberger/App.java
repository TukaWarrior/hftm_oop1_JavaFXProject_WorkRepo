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

//Testing
    public App() {
        bookList.add(new Book("The Shining","Steven King", 447, 95));
        bookList.add(new Book("The Lord of the Rings","J. R. R. Tolkien", 1178, 99));
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
        stage.setTitle("Medienverwaltung");
        stage.setScene(scene);
        stage.show();
    }

//FXML Scene Change
    public static void switchToMainView() {
        FXMLLoader fxmlLoader = createFXMLLoader("PrimaryView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }
    public static void switchToBookEditView() {
        FXMLLoader fxmlLoader = createFXMLLoader("BookEditView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
//        BookEditController controller = fxmlLoader.getController();
//        controller.setBook(selectedBook);

    }

    public static void switchToPrimary(){
        FXMLLoader fxmlLoader = createFXMLLoader("PrimaryView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }

    public static void switchToSecondary(){
        FXMLLoader fxmlLoader = createFXMLLoader("SecondaryView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
    }

    public static void switchToNewBookView(){
        FXMLLoader fxmlLoader = createFXMLLoader("NewBookView.fxml");
        App.scene.setRoot(loadFXML(fxmlLoader));
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

    public void addtoBooklist(){
        bookList.add(new Book("Test","IT's me", 420, 61));
    }
}