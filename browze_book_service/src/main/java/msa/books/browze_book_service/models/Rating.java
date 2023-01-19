package msa.books.browze_book_service.models;

public class Rating {
    private String bookID;
    private VolumeInfo volumeInfo;
    //private String rating=volumeInfo.getAverageRating();


    public Rating(){}

    public Rating(String bookID, VolumeInfo volumeInfo){
        this.bookID = bookID;
        this.volumeInfo = volumeInfo;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }


    /*
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }*/

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }


    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

}
