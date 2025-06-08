/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.flyweight;

/**
 *
 * @author Panda
 */
public class TreeType {

    private String name, color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public void draw(int x, int y) {
        System.out.println("Ağaç tipi: " + name + ", renk: " + color + " çiziliyor konum: (" + x + "," + y + ")");
    }

}
