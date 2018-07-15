/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ptmvctutorial;

import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author MARCUS
 */
class SearchController {

    private String searchPhrase;

    private final JTextField searchTerm;
    private final Model model;
    private final JList searchItems;

    SearchController(JTextField searchTerm, JList searchItems) {

        model = new Model();
        this.searchTerm = searchTerm;
        this.searchItems = searchItems;
    }

    void update() {
        searchPhrase = searchTerm.getText();
        if (model != null) {
            model.save(searchPhrase);
            searchItems.setModel(model.getSearchTerms());
        }

    }
}
