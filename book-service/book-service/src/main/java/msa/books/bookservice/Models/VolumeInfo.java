package msa.books.bookservice.Models;
public class VolumeInfo {
    private String title;
    private String subtitle;
    private String publisher;

    public VolumeInfo(){}
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
}
