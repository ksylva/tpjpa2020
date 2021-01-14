package jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Section {

    private long idSection;
    private String libelle;
    private List<Fiche> fiches;
    private Tableau tableau;

    public Section() {
    }

    public Section(long idSection, String libelle) {
        this.idSection = idSection;
        this.libelle = libelle;
    }

    public void setIdSection(long idSection) {
        this.idSection = idSection;
    }

    @Id
    @GeneratedValue
    public long getIdSection() {
        return idSection;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @OneToMany(mappedBy = "section", cascade = CascadeType.PERSIST)
    public List<Fiche> getFiches() {
        return fiches;
    }

    public void setFiches(List<Fiche> fiches) {
        this.fiches = fiches;
    }

    @ManyToOne
    public Tableau getTableau() {
        return tableau;
    }

    public void setTableau(Tableau tableau) {
        this.tableau = tableau;
    }

    @Override
    public String toString() {
        return "Section{" +
                "idSection=" + idSection +
                ", libelle='" + libelle + '\'' +
                ", fiches=" + fiches +
                ", tableau=" + tableau +
                '}';
    }
}
