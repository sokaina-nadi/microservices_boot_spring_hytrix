package msa.books.ratingservice.Models;

public class VolumeInfo {

    private String averageRating;


    public VolumeInfo(){}
    public VolumeInfo(String averageRating){

        this.averageRating= averageRating;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }
}