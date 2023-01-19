package msa.books.browze_book_service.models;

public class BookBrowzer {

    private String bookID;
    private String etag;
    private String selfLink;
    private String averageRating;
    private String title;
    private String subtitle;
    private String publisher;
    private String rating;

    public BookBrowzer(String bookID, String etag, String selfLink, String averageRating, String title, String subtitle, String publisher) {
        this.bookID = bookID;
        this.etag = etag;
        this.selfLink = selfLink;
        this.averageRating = averageRating;
        this.title = title;
        this.subtitle = subtitle;
        this.publisher = publisher;
    }

    public String getBookID() {
        return bookID;
    }

    public String getEtag() {
        return etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getPublisher() {
        return publisher;
    }



    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



}
