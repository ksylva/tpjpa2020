package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {


    private long idTag;
    private String libelleTag;


    public Tag() {
    }

    public Tag(long idTag, String libelleTag) {
        this.idTag = idTag;
        this.libelleTag = libelleTag;
    }

    public void setIdTag(long idTag) {
        this.idTag = idTag;
    }

    @Id
    @GeneratedValue
    public long getIdTag() {
        return idTag;
    }

    public String getLibelleTag() {
        return libelleTag;
    }

    public void setLibelleTag(String libelleTag) {
        this.libelleTag = libelleTag;
    }
}
