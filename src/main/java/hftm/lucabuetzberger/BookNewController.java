package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.time.Year;

public class BookNewController {

//Fields
    private Book book;
    @FXML
    private TextField txtf_newBookTitle;
    @FXML
    private TextField txtf_newBookAuthor;
    @FXML
    private TextField txtf_newBookReleaseYear;
    @FXML
    private TextField txtf_newBookGenre;
    @FXML
    private TextField txtf_newBookPages;
    @FXML
    private TextField txtf_newBookRating;
    @FXML
    private Button onSave;
    @FXML
    private Button onCancel;


    @FXML

    private void initialize() {
        // Checks if any letters are entered and replaces them
        txtf_newBookPages.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_newBookPages.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 1000000) {
                    txtf_newBookPages.setText(oldValue);
                }
            }
        });

        // Checks if any letters are entered and replaces them
        txtf_newBookReleaseYear.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_newBookReleaseYear.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 0 || rating > Year.now().getValue()) {
                    txtf_newBookReleaseYear.setText(oldValue);
                }
            }
        });

        // Checks if any letters are entered and replaces them
        txtf_newBookRating.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtf_newBookRating.setText(newValue.replaceAll("[^\\d]", ""));
            } else if (!newValue.isEmpty()) {
                int rating = Integer.parseInt(newValue);
                if (rating < 1 || rating > 100) {
                    txtf_newBookRating.setText(oldValue);
                }
            }
        });
    }

    @FXML
    private void onSave() {
        this.book = new Book();
        String title = txtf_newBookTitle.getText();
        String author = txtf_newBookAuthor.getText();
        String releaseYear = txtf_newBookReleaseYear.getText();
        String genre = txtf_newBookGenre.getText();
        String pages = txtf_newBookPages.getText();
        String rating = txtf_newBookRating.getText();

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
        App.getBookList().add(book);
        App.switchToPrimary();
    }

    @FXML
    private void onCancel(){
        App.switchToPrimary();
    }
}
