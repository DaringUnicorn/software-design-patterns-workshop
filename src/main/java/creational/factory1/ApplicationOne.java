/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory1;

/**
 *
 * @author Panda
 */
public class ApplicationOne implements Framework {

    @Override
    public Product makeProduct() {
        return new ProductOne();
    }

}
