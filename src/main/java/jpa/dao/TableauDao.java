package jpa.dao;


import jpa.Section;
import jpa.Tableau;

import java.util.List;

public interface TableauDao {
    /**
     * Provide section by table
     * @param tableId table id
     * @return List of sections
     */
    List<Section> getSectionByTable(long tableId);

    /**
     * Provide a table with the id tableId
     * @param tableId table id
     * @return a table
     */
    Tableau getTable(long tableId);

    /**
     * Save an instance of Tableau in database
     * @param tableau to insert
     */
    void saveTable(jpa.Tableau tableau);
}
