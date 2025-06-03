/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public abstract class Document {

    // Bir "gerçekleştirici" referansı tutalım
    protected PrinterDriver driver;

    protected Document(PrinterDriver driver) {
        this.driver = driver;
    }

    // Soyut: "print" işlemini tanımlar, ama detayı alt sınıflara bırakabilir
    public abstract void print();
}
