/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.flyweight;

/**
 *
 * @author Panda
 */
public class FlyweightPatternExample {

    public static void main(String[] args) {
        Tree oak1 = new Tree(10, 20, TreeFactory.getTreeType("Oak", "Green"));
        Tree oak2 = new Tree(30, 40, TreeFactory.getTreeType("Oak", "Green"));

        Tree pine1 = new Tree(50, 60, TreeFactory.getTreeType("Pine", "Dark Green"));
        Tree pine2 = new Tree(70, 80, TreeFactory.getTreeType("Pine", "Dark Green"));
        
        oak1.draw();
        System.out.println(oak1);
        oak2.draw();
        System.out.println(oak2);
        
        pine1.draw();
        System.out.println(pine1);
        pine2.draw();
        System.out.println(pine2);
    }
}
