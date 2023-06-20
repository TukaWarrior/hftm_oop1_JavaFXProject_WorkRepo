package hftm.lucabuetzberger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {
    private SimpleStringProperty bookTitle = new SimpleStringProperty();
    private SimpleStringProperty bookAuthor = new SimpleStringProperty();
    private SimpleIntegerProperty bookPages = new SimpleIntegerProperty();
    private SimpleIntegerProperty bookRating = new SimpleIntegerProperty();

    //Constructor
    public Book(){
    }

    public Book(String bookTitle, String bookAuthor, int bookPages, int bookRating){
        this.setBookTitle(bookTitle);
        this.setBookAuthor(bookAuthor);
        this.setBookPages(bookPages);
        this.setBookRating(bookRating);
    }

    // Book Title
    public SimpleStringProperty bookTitleProperty(){
        return this.bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle.get();
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle.set(bookTitle);
    }

    // Book Author
    public SimpleStringProperty bookAuthorProperty(){
        return this.bookAuthor;
    }
    public String getBookAuthor(){
        return this.bookAuthor.get();
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor.set(bookAuthor);
    }

    // Book Pages
    public SimpleIntegerProperty bookPagesProperty(){
    return this.bookPages;
    }
    public Integer getBookPages(){
        return this.bookPages.get();
    }
    public void setBookPages(Integer bookPages){
        this.bookPages.set(bookPages);
    }

    // Book Rating
    public SimpleIntegerProperty bookRatingProperty(){
    return this.bookRating;
    }
    public Integer getBookRating(){
        return this.bookRating.get();
    }
    public void setBookRating(Integer bookRating){
        this.bookRating.set(bookRating);
    }
}