/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.visitor;

/**
 *
 * @author Panda
 */
public class AreaVisitor implements ShapeVisitor {

    private double totalArea = 0;

    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        totalArea += area;
        System.out.println("Circle alanı: " + area);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        totalArea += area;
        System.out.println("Rectangle alanı: " + area);
    }

    public double getTotalArea() {
        return totalArea;
    }
}
