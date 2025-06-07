/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.composite;

/**
 *
 * @author Panda
 */
public class FileLeaf implements FileSystemComponent {

    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("File: " + name);
    }

}
