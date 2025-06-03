/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Panda
 */
public class ProgrammingForCurriculum implements Cloneable, IRootCourse {

    String lecturer;
    int year;

    public ProgrammingForCurriculum(int year) {
        this.year = year;
    }

    @Override
    public String getLecturer() {
        return lecturer;
    }

    @Override
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ProgrammingForCurriculum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
