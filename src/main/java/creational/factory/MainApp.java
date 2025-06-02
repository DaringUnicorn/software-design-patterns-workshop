/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory;

/**
 *
 * @author Panda
 */
public class MainApp {

    public static void main(String[] args) {
        Framework framework;
        String choosenApp = args.length > 0 ? args[0] : "one";

        if (choosenApp.equalsIgnoreCase("one")) {
            framework = new ApplicationOne();

        } else {
            framework = new ApplicationTwo();
        }

        Product product = framework.makeProduct();
        product.doSomething();

    }
}
