/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Panda
 */
public class FileDirectory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public FileDirectory(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Directory:" + name);

        for (FileSystemComponent file : children) {
            file.printName();
        }
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

}
