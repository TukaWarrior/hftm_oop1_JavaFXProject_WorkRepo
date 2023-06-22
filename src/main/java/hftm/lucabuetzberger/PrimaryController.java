package hftm.lucabuetzberger;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrimaryController {
    
    //Fields Books
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> bookTitleColumn;
    @FXML
    private TableColumn<Book, String> bookAuthorColumn;
    @FXML
    private TableColumn<Book, Integer> bookReleaseYearColumn;
    @FXML
    private TableColumn<Book, String> bookGenreColumn;
    @FXML
    private TableColumn<Book, Integer> bookPagesColumn;
    @FXML
    private TableColumn<Book, Integer> bookRatingColumn;
    @FXML
    private TextField txtf_bookTitle;
    @FXML
    private TextField txtf_bookAuthor;
    @FXML
    private TextField txtf_bookPages;
    @FXML
    private TextField txtf_bookRating;
    @FXML
    private TextField txtf_bookReleaseYear;
    @FXML
    private Button newBook;
    @FXML
    private Button editBook;

    //Fields Movie
    @FXML
    private TableView<Movie> movieTable;
    @FXML
    private TableColumn<Movie, String> movieTitleColumn;
    @FXML
    private TableColumn<Movie, String> movieDirectorColumn;
    @FXML
    private TableColumn<Movie, Integer> movieReleaseYearColumn;
    @FXML
    private TableColumn<Movie, String> movieGenreColumn;
    @FXML
    private TableColumn<Movie, Integer> movieLengthColumn;
    @FXML
    private TableColumn<Movie, Integer> movieRatingColumn;



    @FXML
    public void initialize(){
        // Initializes the book table and columns
        this.bookTitleColumn.setCellValueFactory(cellData -> cellData.getValue().bookTitleProperty());
        this.bookAuthorColumn.setCellValueFactory(cellData -> cellData.getValue().bookAuthorProperty());
        this.bookReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().bookReleaseYearProperty().asObject());
        this.bookGenreColumn.setCellValueFactory(cellData -> cellData.getValue().bookGenreProperty());
        this.bookPagesColumn.setCellValueFactory(cellData -> cellData.getValue().bookPagesProperty().asObject());
        this.bookRatingColumn.setCellValueFactory(cellData -> cellData.getValue().bookRatingProperty().asObject());

        this.bookTable.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> this.showBookDetails(newValue));
        this.bookTable.setItems(App.getBookList());

        // Initializes the movie table and columns
        this.movieTitleColumn.setCellValueFactory(cellData -> cellData.getValue().movieTitleProperty());
        this.movieDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().movieDirectorProperty());
        this.movieReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().movieReleaseYearProperty().asObject());
        this.movieGenreColumn.setCellValueFactory(cellData -> cellData.getValue().movieGenreProperty());
        this.movieLengthColumn.setCellValueFactory(cellData -> cellData.getValue().movieLengthProperty().asObject());
        this.movieRatingColumn.setCellValueFactory(cellData -> cellData.getValue().movieRatingProperty().asObject());

//        this.movieTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.showMovieDetails(newValue));
        this.movieTable.setItems(App.getMovieList());

        // Listener for bookEdit button
        bookTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Book is selected, enable the editBook button
                editBook.setDisable(false);
            } else {
                // No book is selected, disable the editBook button
                editBook.setDisable(true);
            }
        });
    }

    //Book Methods
    private void showBookDetails(Book book) {
        if (book != null) {
            // Fill the labels with info from the book object.
            this.txtf_bookTitle.setText(book.getBookTitle());
            this.txtf_bookAuthor.setText(book.getBookAuthor());
            this.txtf_bookReleaseYear.setText(String.valueOf(book.getBookReleaseYear()));
            this.txtf_bookPages.setText(String.valueOf(book.getBookPages()));
            this.txtf_bookRating.setText(String.valueOf(book.getBookRating()));
        } else {
            // book is null, remove all the text.
            txtf_bookTitle.setText("");
            txtf_bookAuthor.setText("");
            txtf_bookPages.setText("");
            txtf_bookRating.setText("");
        }
    }
//    Book Buttons
    @FXML
    private void newBook() {
        App.switchToNewBookView();
    }
    @FXML
    private void editBook() {
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null){
            App.switchToBookEditView(selectedBook);
            this.showBookDetails(selectedBook);
        } else {
            System.out.println("No book selected");
        }
    }


//    @FXML
//    public void onEdit() {
//        Prisoner selectedPrisoner = prisonerTable.getSelectionModel().getSelectedItem();
//        if (selectedPrisoner != null) {
//            App.switchToEditView(selectedPrisoner);
//            this.showPrisonerDetails(selectedPrisoner);
//        } else {
//            // Nothing selected.
//            System.out.println("Nothing happened!");
//        }


    @FXML
    private void switchToSecondary() throws IOException {
        App.switchToSecondary();
    }
}
