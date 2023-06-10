package hftm.lucabuetzberger;

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
    public void initialize(){
        this.bookTitleColumn.setCellValueFactory(cellData -> cellData.getValue().bookTitlePropery());
        this.bookAuthorColumn.setCellValueFactory(cellData -> cellData.getValue().bookAuthorPropery());
        this.bookPagesColumn.setCellValueFactory(cellData -> cellData.getValue().bookPagesPropery());
        this.bookRatingColumn.setCellValueFactory(cellData -> cellData.getValue().bookRatingPropery());

        this.bookTable.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> this.showBookDetails(newValue));

        this.bookTable.setItems(App.getPrisonerList());
    }

    // Methods
    // private void showBookDetails(Book book) {
    //     if (book != null) {
    //         // Fill the labels with info from the prisoner object.
    //         this.firstnameLabel.setText(prisoner.getFirstname());
    //         this.lastnameLabel.setText(prisoner.getLastname());
    //     } else {
    //         // Prisoner is null, remove all the text.
    //         firstnameLabel.setText("");
    //         lastnameLabel.setText("");
    //     }
    // }

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
