/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory3;

/**
 *
 * @author Panda
 */
public class Car implements IProduct {

    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

}
