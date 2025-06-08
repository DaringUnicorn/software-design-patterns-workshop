/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.visitor;

/**
 *
 * @author Panda
 */
public interface ShapeVisitor {

    void visitCircle(Circle circle);

    void visitRectangle(Rectangle rectangle);
}
