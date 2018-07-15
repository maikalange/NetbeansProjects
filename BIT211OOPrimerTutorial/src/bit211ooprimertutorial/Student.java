/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ooprimertutorial;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class Student extends Person {
    private String id;
    private HashMap<Integer,String> courseList;
    
    public Student(String name, String nrc) {
        super(name, nrc);
    }
    
    public void setCourses(HashMap courses){
        this.courseList = courses;
    }
    
    public void setId(String id)
    {
        this.id  = id;
    }
}
