package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.Year;

public class BookEditController {
    @FXML
    private TextField txtf_bookTitle;
    @FXML
    private TextField txtf_bookAuthor;
    @FXML
    private TextField txtf_bookReleaseYear;
    @FXML
    private TextField txtf_bookGenre;
    @FXML
    private TextField txtf_bookPages;
    @FXML
    private TextField txtf_bookRating;
    private Book book;

    @FXML
    private void initialize() {
        // Checks if any letters are entered and replaces them
        txtf_bookPages.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_bookPages.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 1000000) {
                    txtf_bookPages.setText(oldValue);
                }
            }
        });

        // Checks if any letters are entered and replaces them
        txtf_bookReleaseYear.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_bookReleaseYear.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 0 || rating > Year.now().getValue()) {
                    txtf_bookReleaseYear.setText(oldValue);
                }
            }
        });

        // Checks if any letters are entered and replaces them
        txtf_bookRating.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_bookRating.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 100) {
                    txtf_bookRating.setText(oldValue);
                }
            }
        });
    }

    public void setBook(Book book) {
        this.book = book;
//        Schreibt den vorherigen Wert ins Textfeld, bevor dieses editiert wird
        txtf_bookTitle.setText(book.getBookTitle());
        txtf_bookAuthor.setText(book.getBookAuthor());
        txtf_bookReleaseYear.setText(String.valueOf(book.getBookReleaseYear()));
        txtf_bookGenre.setText(book.getBookGenre());
        txtf_bookPages.setText(String.valueOf(book.getBookPages()));
        txtf_bookRating.setText(String.valueOf(book.getBookRating()));
    }

    @FXML
    private void onSave() {
        String title = txtf_bookTitle.getText();
        String author = txtf_bookAuthor.getText();
        String releaseYear = txtf_bookReleaseYear.getText();
        String genre = txtf_bookGenre.getText();
        String pages = txtf_bookPages.getText();
        String rating = txtf_bookRating.getText();

        if (!title.isEmpty()){
            this.book.setBookTitle(title);
        }
        if (!author.isEmpty()){
            this.book.setBookAuthor(author);
        }
        if (!releaseYear.isEmpty()){
            this.book.setBookReleaseYear(Integer.parseInt(releaseYear));
        }
        if (!author.isEmpty()){
            this.book.setBookGenre(genre);
        }
        if (!pages.isEmpty()){
            this.book.setBookPages(Integer.parseInt(pages));
        }
        if (!rating.isEmpty()){
            this.book.setBookRating(Integer.parseInt(rating));
        }
//        App.getBookList().add(book);
        App.switchToPrimary();
    }

    @FXML
    private void onCancel() {
        App.switchToMainView();
    }
}
