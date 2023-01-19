package msa.books.shelfservice.Models;

import java.util.List;

public class Shelf {

    private String shelfID;
    private String title;
    private String access;
    private String volumeCount;

    public Shelf(){}
    public Shelf(String shelfID, String title, String access, String volumeCount){
        this.shelfID=shelfID;
        this.title = title;
        this.access =access;
        this.volumeCount=volumeCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getVolumeCount() {
        return volumeCount;
    }

    public void setVolumeCount(String volumeCount) {
        this.volumeCount = volumeCount;
    }

    public String getShelfID() {
        return shelfID;
    }

    public void setShelfID(String shelfID) {
        this.shelfID = shelfID;
    }



}
