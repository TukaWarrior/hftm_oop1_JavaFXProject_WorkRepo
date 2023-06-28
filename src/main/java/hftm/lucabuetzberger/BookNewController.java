package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.time.Year;

public class BookNewController {

    //region Fields
    private Book book;
    //endregion

    //region FXML Elements
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
    //endregion

    @FXML
    private void initialize() {

        //region Text Input Constraints: txtf_bookPages
        //Checks if any letters are entered and replaces them
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
        //endregion

        //region Text Input Constraints: txtf_bookReleaseYear
        //Checks if any letters are entered and replaces them
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
        //endregion

        //region Text Input Constraints: txtf_bookRating
        //Checks if any letters are entered and replaces them
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
        //endregion
    }

    //region Button: Save
    @FXML
    private void onSave() {
        this.book = new Book();
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
        App.getBookList().add(book);
        App.switchToPrimaryView();
    }
    //endregion

    //region Button: Cancel
    @FXML
    private void onCancel(){
        App.switchToPrimaryView();
    }
    //endregion
}
