/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.nullObject;

/**
 *
 * @author Panda
 */
public class RealEmployee extends Employee {

    public RealEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
