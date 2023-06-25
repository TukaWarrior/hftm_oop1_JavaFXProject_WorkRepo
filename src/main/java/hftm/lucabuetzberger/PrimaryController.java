package hftm.lucabuetzberger;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
    @FXML
    private Button deleteBook;

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
    private Button newMovie;
    @FXML
    private Button editMovie;
    @FXML
    private Button deleteMovie;



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
                .addListener((observable, oldValue, newValue) -> this.getBookDetails(newValue));
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
    private void getBookDetails(Book book) {
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
            this.getBookDetails(selectedBook);
        } else {
            System.out.println("No book selected");
        }
    }
    @FXML
    private void deleteBook(){
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null){
            ObservableList<Book> bookList = App.getBookList();
            bookTable.getItems().remove(selectedBook);
            bookList.remove(selectedBook);
            System.out.println("Books in bookList:");
            for (Book book : bookList) {
                System.out.println(book.getBookTitle()); // Print book title
            }
        } else{
        }
    }

    @FXML
    private void newMovie(){
        App.switchToNewMovieView();
    }
    @FXML
    private void editMovie(){
        Movie selectedMovie = movieTable.getSelectionModel().getSelectedItem();
        if (selectedMovie != null){
            App.switchToMovieEditView(selectedMovie);
        } else {
            System.out.println("No movie selected");
        }
    }

    @FXML
    private void deleteMovie(){
        Movie selectedMovie = movieTable.getSelectionModel().getSelectedItem();
        if (selectedMovie != null){
            ObservableList<Movie> movieList = App.getMovieList();
            movieTable.getItems().remove(selectedMovie);
            movieList.remove(selectedMovie);
            System.out.println("Movies in movieList:");
            for (Movie movie : movieList) {
                System.out.println(movie.getMovieTitle()); // Print book title
            }
        } else{
        }
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.switchToSecondaryView();
    }
}
