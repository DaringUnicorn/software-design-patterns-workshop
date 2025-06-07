/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Yeşil daire çiziliyor: " + "x= " + x + ", y= " + ", radius= " + radius);
    }

}
