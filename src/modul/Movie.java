package modul;

import java.sql.Date;
import java.sql.Time;

public class Movie {
    int idM;
    String title;
    Time duration;
    String description;
    Date publishdeDate;
    String pngRoot;
    String videoRoot;
    String actors;

    public Movie(int idM, String title, Time duration, String description, Date publishdeDate, String pngRoot, String videoRoot, String actors) {
        this.idM = idM;
        this.title = title;
        this.duration = duration;
        this.description = description;
        this.publishdeDate = publishdeDate;
        this.pngRoot = pngRoot;
        this.videoRoot = videoRoot;
        this.actors = actors;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishdeDate() {
        return publishdeDate;
    }

    public void setPublishdeDate(Date publishdeDate) {
        this.publishdeDate = publishdeDate;
    }

    public String getPngRoot() {
        return pngRoot;
    }

    public void setPngRoot(String pngRoot) {
        this.pngRoot = pngRoot;
    }

    public String getVideoRoot() {
        return videoRoot;
    }

    public void setVideoRoot(String videoRoot) {
        this.videoRoot = videoRoot;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
