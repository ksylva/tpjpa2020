package jpa;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Fiche {

    private long idFiche;
    private Date dateButoire;
    private int duree;
    private String lieu;
    private String url;
    private String note;
    private Utilisateur utilisateur;
    private List<Tag> tags;
    private Section section;

    public Fiche() {
    }

    public Fiche(Date dateButoire,
                 int duree, String lieu, String url,
                 String note, Utilisateur utilisateur, List<Tag> tags, Section section) {
        this.idFiche = getIdFiche();
        this.dateButoire = dateButoire;
        this.duree = duree;
        this.lieu = lieu;
        this.url = url;
        this.note = note;
        this.utilisateur = utilisateur;
        this.tags = tags;
        this.section = section;
    }

    public void setIdFiche(long idFiche) {
        this.idFiche = idFiche;
    }

    @Id
    @GeneratedValue
    public long getIdFiche() {
        return idFiche;
    }

    public Date getDateButoire() {
        return dateButoire;
    }

    public void setDateButoire(Date dateButoire) {
        this.dateButoire = dateButoire;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @ManyToOne
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @ManyToMany
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @ManyToOne
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
