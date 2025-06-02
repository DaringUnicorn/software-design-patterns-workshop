/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory3;

/**
 *
 * @author Panda
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new Factory();
        IProduct product = factory.getProduct("Car");
        System.out.println(product.getModel());
    }

}
