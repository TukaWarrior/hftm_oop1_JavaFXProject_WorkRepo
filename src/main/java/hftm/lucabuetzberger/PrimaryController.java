package hftm.lucabuetzberger;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrimaryController {
    
    // Fields
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> bookTitleColumn;
    @FXML
    private TableColumn<Book, String> bookAuthorColumn;
    @FXML
    private TableColumn<Book, Integer> bookPagesColumn;
    @FXML
    private TableColumn<Book, Double> bookRatingColumn;
    @FXML
    private TextField txtf_bookTitle;
    @FXML
    private TextField txtf_bookAuthor;
    @FXML
    private TextField txtf_bookPages;
    @FXML
    private TextField txtf_bookRating;

    @FXML
    public void initialize(){
        // Initializes the book table with the columns
        this.bookTitleColumn.setCellValueFactory(cellData -> cellData.getValue().bookTitleProperty());
        this.bookAuthorColumn.setCellValueFactory(cellData -> cellData.getValue().bookAuthorProperty());
        this.bookPagesColumn.setCellValueFactory(cellData -> cellData.getValue().bookPagesProperty().asObject());
        this.bookRatingColumn.setCellValueFactory(cellData -> cellData.getValue().bookRatingProperty().asObject());

        this.bookTable.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> this.showBookDetails(newValue));

        this.bookTable.setItems(App.getBookList());
    }

    // Methods
    private void showBookDetails(Book book) {
        if (book != null) {
            // Fill the labels with info from the prisoner object.
            this.txtf_bookTitle.setText(book.getBookTitle());
            this.txtf_bookAuthor.setText(book.getBookAuthor());
            this.txtf_bookPages.setText(String.valueOf(book.getBookPages()));
            this.txtf_bookRating.setText(String.valueOf(book.getBookRating()));
        } else {
            // Prisoner is null, remove all the text.
            txtf_bookTitle.setText("");
            txtf_bookAuthor.setText("");
            txtf_bookPages.setText("");
            txtf_bookRating.setText("");
        }
    }

    @FXML
    private void editBookTitle(){
    }
    @FXML
    private void editBookAuthor(){
    }
    @FXML
    private void editBookPages(){
    }
    @FXML
    private void editBookRating(){
    }


    @FXML
    private void switchToSecondary() throws IOException {
        App.setSceneRoot("secondary");
    }
}
