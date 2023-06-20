package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BookEditController {
    @FXML
    private TextField txtf_bookTitle2;
    @FXML
    private TextField txtf_bookAuthor2;
    @FXML
    private TextField txtf_bookPages2;
    @FXML
    private TextField txtf_bookRating2;


//    private Book book;
//    public void setBook(Book book) {
//        this.book = book;
//
        // Schreibt den vorherigen Wert ins Textfeld, bevor dieses editiert wird
//        txtf_bookTitle2.setText(book.getBookTitle());
//        txtf_bookAuthor2.setText(book.getBookAuthor());
//        txtf_bookPages2.setText(String.valueOf(book.getBookPages()));
//        txtf_bookRating2.setText(String.valueOf(book.getBookRating()));
//    }

//    private void onSave() {
//        this.book.setBookTitle(txtf_bookTitle2.getText());
//        this.book.setBookAuthor(txtf_bookAuthor2.getText());
//        this.book.setBookPages(txtf_bookPages2.getText());
//        this.book.setBookRating(txtf_bookRating2.getText());
//        App.switchToMainView();
//    }

    @FXML
    private void onCancel() {
        App.switchToMainView();
    }
}
