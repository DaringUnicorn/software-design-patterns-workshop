/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.nullObject;

/**
 *
 * @author Panda
 */
public class NullObjectPatternExample {

    public static void main(String[] args) {
        String[] names = {"Ali", "CouldNotFind", "Ayşe", "Unknown"};
        for (String name : names) {
            Employee emp = EmployeeFactory.getEmployee(name);
            System.out.println("Employee: " + emp.getName());
        }
    }
}
