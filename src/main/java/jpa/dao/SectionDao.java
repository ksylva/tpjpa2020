package jpa.dao;

import jpa.Fiche;
import jpa.Section;

import java.util.List;

public interface SectionDao {

    void saveSection(Section section);

    List<Fiche> getAllFiches();

    Section getSectionByName(String name);
}
