/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype;

/**
 *
 * @author Panda
 */
public class Client {

    public static void main(String[] args) {

        IRootCourse courseComputer = PrototypeStore.getCourses("CPI2025");
        courseComputer.setLecturer("Ahmet Ak");
    }
}
