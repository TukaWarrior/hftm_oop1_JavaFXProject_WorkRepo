package hftm.lucabuetzberger;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {
    private SimpleStringProperty bookTitle = new SimpleStringProperty();
    private SimpleStringProperty bookAuthor = new SimpleStringProperty();
    private SimpleIntegerProperty bookPages = new SimpleStringProperty();
    private SimpleDoubleProperty bookRating = new SimpleStringProperty();

    public Book(String bookTitle, String bookAuthor, int bookPages, double bookRating){
        this.setBookTitle(bookTitle);
        this.setBookAuthor(bookAuthor);
        this.setBookPages(bookPages);
        this.setBookRating(bookRating);
    }

    // Book Title
    public SimpleStringProperty bookTitlePropery(){
        return this.bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle.get();
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle.set(bookTitle);
    }

    // Book Author
    public SimpleStringProperty bookAuthorPropery(){
        return this.bookAuthor;
    }
    public String getBookAuthor(){
        return this.bookAuthor.get();
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor.set(bookAuthor);
    }

    // Book Pages
    public SimpleIntegerProperty bookPagesPropery(){
    return this.bookPages;
    }
    public int getBookPages(){
        return this.bookPages.get();
    }
    public void setBookPages(int bookPages){
        this.bookPages.set(bookPages);
    }

    // Book Rating
    public SimpleDoubleProperty bookRatingPropery(){
    return this.bookRating;
    }
    public double getBookRating(){
        return this.bookRating.get();
    }
    public void setBookRating(double bookRating){
        this.bookRating.set(bookRating);
    }
}
