/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.decorator;

/**
 *
 * @author Panda
 */
public class BasicCoffee implements Coffee {

    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

}
