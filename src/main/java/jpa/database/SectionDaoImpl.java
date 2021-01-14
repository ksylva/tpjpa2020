package jpa.database;

import jpa.EntityManagerHelper;
import jpa.Fiche;
import jpa.Section;
import jpa.dao.SectionDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class SectionDaoImpl implements SectionDao {
    EntityManager em = EntityManagerHelper.getEntityManager();

    @Override
    public void saveSection(Section section) {
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(section);
        et.commit();
    }

    @Override
    public List<Fiche> getAllFiches() {
        String query = "select fiche from Section as sect join fetch sect.fiches as fiche";
        return em.createNamedQuery(query, Fiche.class)
                .getResultList();
    }

    @Override
    public Section getSectionByName(String name) {
        String query = "select sect from Section as sect where sect.libelle = :name";
        return em.createQuery(query, Section.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
