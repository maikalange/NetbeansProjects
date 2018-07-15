/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211modelviewcontrollertutorial;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author MARCUS
 */
public class Controller {

    //Declare fields

    private final JTextField searchTerm;
    private final JList searchTerms;
    private final Model model;

    private final JComboBox comboBox;
    private final JFrame frame;

    public Controller(JTextField searchTerm, JList searchTerms, JComboBox comboBox, JFrame frame) {
        //Initialise fields
        this.searchTerm = searchTerm;
        this.searchTerms = searchTerms;
        model = new Model();

        this.comboBox = comboBox;
        this.frame = frame;
    }

    void saveItem() {
        if (model != null) {
            model.addItem(searchTerm.getText());
            searchTerms.setListData(model.getItemList());
            
            comboBox.addItem(model.getItemList());

        }
        searchTerm.setText(null);//update the view
    }
}
