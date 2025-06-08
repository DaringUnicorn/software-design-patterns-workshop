/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy;

/**
 *
 * @author Panda
 */
public class ProxyPatternExample {
    public static void main(String[] args) {
        
        Image image = new ProxyImage("test_image.jpg");
        
        image.display();
        System.out.println("***********");
        image.display();
    }
}
