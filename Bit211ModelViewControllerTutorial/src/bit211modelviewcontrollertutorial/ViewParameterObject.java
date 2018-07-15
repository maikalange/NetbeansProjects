/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211modelviewcontrollertutorial;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author MARCUS
 */
public class ViewParameterObject {
    public ViewParameterObject(JFrame frame){
        for(Component c: frame.getComponents()){
            if (c instanceof JTextField) {
                ((JTextField)c).setText("");
            }
        }
    }
}
