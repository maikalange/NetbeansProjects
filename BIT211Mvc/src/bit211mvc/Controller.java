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
public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    public void setLastName(String name) {
        model.setLastName(name);
    }

    public void setFirstName(String firstName) {
        model.setName(firstName);
    }

    public String getLastName() {
        return model.getLastName();
    }

    public String getFirstName() {
        return model.getName();
    }

    public void updateView() {
        view.ShowFullName(model);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        View v = new View();
        Model m = getModel();

        Controller c = new Controller(m, v);
        c.updateView();

        c.setFirstName("Marcus Hsu ");
        c.updateView();
    }

    private static Model getModel() {
        Model m = new Model();
        m.setLastName("Nyirenda");
        m.setName("Joseph ");
        return m;
    }
}
