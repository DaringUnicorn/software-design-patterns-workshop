/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy;

/**
 *
 * @author Panda
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    private void loadFromDisk() {
        System.out.println("Yükleniyor: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Gösteriliyor: " + fileName);
    }

}
