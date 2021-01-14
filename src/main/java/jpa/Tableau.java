package jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tableau {

    private long idTableau;
    private String name;
    private List<Section> sections;

    public Tableau() {
    }

    public Tableau( List<Section> sections, String name) {
        this.idTableau = getIdTableau();
        this.sections = sections;
        this.name = name;
    }

    public void setIdTableau(long idTableau) {
        this.idTableau = idTableau;
    }

    @Id
    @GeneratedValue
    public long getIdTableau() {
        return idTableau;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "tableau", cascade = CascadeType.PERSIST)
    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> fiches) {
        this.sections = fiches;
    }
}
