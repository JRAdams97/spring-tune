package au.com.jradams.springtune.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Artist")
public class Artist {

    //-------------------------------------------------------------------------
    //  Fields
    //-------------------------------------------------------------------------

    @Id
    private String id;

    private String name;
    private Date formationDate;

    //-------------------------------------------------------------------------
    //  Accessors & Mutators
    //-------------------------------------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Date formationDate) {
        this.formationDate = formationDate;
    }
}
