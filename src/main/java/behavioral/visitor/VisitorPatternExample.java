/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.visitor;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Panda
 */
public class VisitorPatternExample {

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(2.0),
                new Rectangle(3.0, 4.0),
                new Circle(1.0)
        );

        AreaVisitor areaVisitor = new AreaVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }
        System.out.println("Toplam alan: " + areaVisitor.getTotalArea());
    }
}
