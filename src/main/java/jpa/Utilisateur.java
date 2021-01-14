package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Utilisateur {

    private long idUtilisateur;
    private String name;
    private List<Fiche> fiches;

    public Utilisateur() {
    }

    public Utilisateur(long idUtilisateur, String name) {
        this.idUtilisateur = idUtilisateur;
        this.name = name;
    }

    public void setIdUtilisateur(long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Id
    @GeneratedValue
    public long getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "utilisateur")
    public List<Fiche> getFiches() {
        return fiches;
    }

    public void setFiches(List<Fiche> fiches) {
        this.fiches = fiches;
    }
}
