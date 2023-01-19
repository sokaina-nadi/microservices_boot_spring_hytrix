package msa.books.browze_book_service.models;


public class VolumeInfo {

    private String averageRating;

    private String title;
    private String subtitle;
    private String publisher;


    public VolumeInfo(){}
    public VolumeInfo(String averageRating){
        this.averageRating= averageRating;
    }
    public VolumeInfo(String title,String subtitle,String publisher){
        this.title = title;
        this.subtitle = subtitle;
        this.publisher = publisher;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }
}