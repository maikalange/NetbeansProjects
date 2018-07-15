/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211mvc;

/**
 *
 * @author MARCUS
 */
public class View {

    public void ShowFullName(Model model) {
        System.out.println(model.getName() + model.getLastName());
    }

}
