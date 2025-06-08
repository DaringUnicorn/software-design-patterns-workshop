/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.nullObject;

/**
 *
 * @author Panda
 */
public class EmployeeFactory {

    private static final String[] VALID_NAMES = {"Ali", "Veli", "Ayşe"};

    public static Employee getEmployee(String name) {
        for (String valid : VALID_NAMES) {
            if (valid.equalsIgnoreCase(name)) {
                return new RealEmployee(name);
            }
        }
        return new NullEmployee();
    }
}
