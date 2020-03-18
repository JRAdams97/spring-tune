package au.com.jradams.springtune.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Album")
public class Album {

    //-------------------------------------------------------------------------
    //  Fields
    //-------------------------------------------------------------------------

    @Id
    private String id;

    @Indexed(name = "albumTitle")
    private String title;

    @DBRef
    private String artist;

    private String genre;

    //-------------------------------------------------------------------------
    //  Accessors & Mutators
    //-------------------------------------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
