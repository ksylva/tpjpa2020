package jpa;

import jpa.dao.TableauDao;
import jpa.database.TableauDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {
			/*Section section1 = new Section();
			Section section2 = new Section();
			Section section3 = new Section();

			Section section4 = new Section();
			Section section5 = new Section();
			Section section6 = new Section();

			section1.setLibelle("En attente");
			section2.setLibelle("En cours");
			section3.setLibelle("Realise");

			section4.setLibelle("En attente");
			section5.setLibelle("En cours");
			section6.setLibelle("Realise");

			List<Section> sections1 = new ArrayList<>();
			List<Section> sections2 = new ArrayList<>();

			sections1.add(section1); sections1.add(section2); sections1.add(section3);
			sections2.add(section4); sections2.add(section5); sections2.add(section6);

			Tableau tab = new Tableau(sections1, "Tableau 1");
			Tableau tab2 = new Tableau(sections2, "Tableau 2");

			section1.setTableau(tab);
			section2.setTableau(tab);
			section3.setTableau(tab);

			section4.setTableau(tab2);
			section5.setTableau(tab2);
			section6.setTableau(tab2);

			Utilisateur user1 = new Utilisateur();
			Utilisateur user2 = new Utilisateur();
			Utilisateur user3 = new Utilisateur();
			user1.setName("User 1");
			user2.setName("User 2");
			user3.setName("User 3");
			*//*manager.persist(user1);
			manager.persist(user2);
			manager.persist(user3);*//*

			List<Tag> tags = new ArrayList<>();
			Tag tag1 = new Tag(); tag1.setLibelleTag("Front");
			Tag tag2 = new Tag(); tag2.setLibelleTag("Back");

			tags.add(tag1); tags.add(tag2);
			List<Tag> tagList = new ArrayList<>();
			Tag tag3 = new Tag(); tag3.setLibelleTag("Fullstack"); tagList.add(tag3);


			Fiche fiche1 = new Fiche();
			fiche1.setDuree(60);
			fiche1.setDateButoire(new Date());
			fiche1.setLieu("Cesson-Sévigné");
			fiche1.setNote("Developpement du module 1.");
			fiche1.setSection(section1);
			fiche1.setUtilisateur(user1);
			fiche1.setTags(tags);

			Fiche fiche2 = new Fiche(new Date(), 48, "Rennes",
					"", "Travaux de maintenance", user1, tagList, section4);

			List<Fiche> fiches = new ArrayList<>();
			List<Fiche> ficheList = new ArrayList<>();
			fiches.add(fiche1); ficheList.add(fiche2);

			manager.persist(tag1);
			manager.persist(tag2);
			manager.persist(tag3);

			section1.setFiches(fiches);
			section4.setFiches(ficheList);*/

			/*manager.persist(fiche1);
			manager.persist(section1);
			manager.persist(section2);
			manager.persist(section3);
			manager.persist(tab);*/

			TableauDao tableauDao = new TableauDaoImpl();

			Tableau tab = tableauDao.getTable(7);
			//List<Section> sections = tableauDao.getSectionByTable(7);

			System.err.println("Le Tableau: "+tab);

			int i = 1;
			/*for (Section s: sections){
				System.err.println("La Section "+i+": "+s);
				i++;
			}*/

			/*manager.persist(user1);
			manager.persist(user2);
			manager.persist(user3);

			//manager.persist(fiche1);
			//manager.persist(fiche2);

			//tableauDao.saveTable(tab);
			//tableauDao.saveTable(tab2);
			//manager.flush();*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
