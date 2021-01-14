package jpa.database;

import jpa.EntityManagerHelper;
import jpa.Section;
import jpa.Tableau;
import jpa.dao.TableauDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class TableauDaoImpl implements TableauDao {

    EntityManager em = EntityManagerHelper.getEntityManager();

    @Override
    public List<Section> getSectionByTable(long tableId) {
        String query ="select table.sections from Tableau as table join fetch table.sections where table.idTableau = :id ";

        return em.createQuery(query, Section.class)
                .setParameter("id", tableId)
                .getResultList();
    }

    @Override
    public Tableau getTable(long idTable) {
        String query = "select table from Tableau as table where table.idTableau = :id";

        return em.createQuery(query, Tableau.class)
                .setParameter("id", idTable)
                .getSingleResult();
    }

    @Override
    public void saveTable(Tableau tableau) {
        EntityTransaction et = em.getTransaction();

        //et.begin();
        em.persist(tableau);
        //et.commit();
    }
}
