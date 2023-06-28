package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {

    //region Fields
    private SimpleStringProperty bookTitle = new SimpleStringProperty();
    private SimpleStringProperty bookAuthor = new SimpleStringProperty();
    private SimpleIntegerProperty bookReleaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty bookGenre = new SimpleStringProperty();
    private SimpleIntegerProperty bookPages = new SimpleIntegerProperty();
    private SimpleIntegerProperty bookRating = new SimpleIntegerProperty();
    //endregion

    //region Constructors
    public Book(){
    }
    public Book(String bookTitle, String bookAuthor, int bookReleaseYear, String bookGenre, int bookPages, int bookRating){
        this.setBookTitle(bookTitle);
        this.setBookAuthor(bookAuthor);
        this.setBookReleaseYear(bookReleaseYear);
        this.setBookGenre(bookGenre);
        this.setBookPages(bookPages);
        this.setBookRating(bookRating);
    }
    //endregion

    //region Attribute Book Title
    public SimpleStringProperty bookTitleProperty(){
        return this.bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle.get();
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle.set(bookTitle);
    }
    //endregion

    //region Attribute Book Author
    public SimpleStringProperty bookAuthorProperty(){
        return this.bookAuthor;
    }
    public String getBookAuthor(){
        return this.bookAuthor.get();
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor.set(bookAuthor);
    }
    //endregion

    //region Attribute Book Release Year
    public SimpleIntegerProperty bookReleaseYearProperty(){
        return this.bookReleaseYear;
    }
    public Integer getBookReleaseYear(){
        return this.bookReleaseYear.get();
    }
    public void setBookReleaseYear(Integer bookReleaseYear){
        this.bookReleaseYear.set(bookReleaseYear);
    }
    //endregion

    //region Attribute Book Genre
    public SimpleStringProperty bookGenreProperty(){
        return this.bookGenre;
    }
    public String getBookGenre(){
        return this.bookGenre.get();
    }
    public void setBookGenre(String bookGenre){
        this.bookGenre.set(bookGenre);
    }
    //endregion

    //region Attribute Book Pages
    public SimpleIntegerProperty bookPagesProperty(){
    return this.bookPages;
    }
    public Integer getBookPages(){
        return this.bookPages.get();
    }
    public void setBookPages(Integer bookPages){
        this.bookPages.set(bookPages);
    }
    //endregion

    //region Attribute Book Rating
    public SimpleIntegerProperty bookRatingProperty(){
    return this.bookRating;
    }
    public Integer getBookRating(){
        return this.bookRating.get();
    }
    public void setBookRating(Integer bookRating){
        this.bookRating.set(bookRating);
    }
    //endregion

    //region All Book Attributes (for sorting function)
    public String getBookAttributes() {
        StringBuilder attributes = new StringBuilder();
        attributes.append(bookTitle.get()).append(" ");
        attributes.append(bookAuthor.get()).append(" ");
        attributes.append(bookReleaseYear.get()).append(" ");
        attributes.append(bookGenre.get()).append(" ");
        attributes.append(bookPages.get()).append(" ");
        attributes.append(bookRating.get());
        return attributes.toString().toLowerCase();
    }
    //endregion
}