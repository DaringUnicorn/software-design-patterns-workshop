/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Panda
 */
public class PrototypeStore {

    static Map<String, IRootCourse> courses = new HashMap<>();

    static {
        courses.put("CPI2024", new ProgrammingForCurriculum(2024));
        courses.put("CPI2024", new ProgrammingForCurriculum(2025));
    }
    
    public static IRootCourse getCourses(String key){
            return (IRootCourse)((ProgrammingForCurriculum)courses.get(key)).clone();
    }

}
