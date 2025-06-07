/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.composite;

/**
 *
 * @author Panda
 */
public class CompositePatternExample {

    public static void main(String[] args) {
        FileDirectory root = new FileDirectory("root");
        root.addComponent(new FileLeaf("file1.txt"));
        root.addComponent(new FileLeaf("file2.txt"));

        FileDirectory subDirectory = new FileDirectory("subDirectory");
        subDirectory.addComponent(new FileLeaf("file3.txt"));
        root.addComponent(subDirectory);

        root.printName();
    }
}
