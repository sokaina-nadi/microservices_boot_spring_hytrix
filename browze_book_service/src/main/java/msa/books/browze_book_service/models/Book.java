package msa.books.browze_book_service.models;


public class Book {
    private String bookID;

    private String etag;

    private String selfLink;

    private VolumeInfo volumeInfo;

    public Book(){}


    public Book(String bookID, String etag, String selfLink, VolumeInfo volumeInfo){
        this.bookID = bookID;
        this.etag =etag;
        this.selfLink=selfLink;
        this.volumeInfo=volumeInfo;
    }


    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }


    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

}
