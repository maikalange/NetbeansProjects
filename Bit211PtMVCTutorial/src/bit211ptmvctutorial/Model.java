/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ptmvctutorial;

import javax.swing.DefaultListModel;

/**
 *
 * @author MARCUS
 */
class Model {

    private final DefaultListModel<String> searchPhrases;

    public Model() {
        searchPhrases = new DefaultListModel<>();
    }

    void save(String searchPhrase) {
        searchPhrases.addElement(searchPhrase);
        PersistenceManager.save(searchPhrase);
    }
    
    DefaultListModel<String> getSearchTerms(){
        return searchPhrases;
    }
}
