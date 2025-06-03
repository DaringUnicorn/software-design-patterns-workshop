/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class PdfDocument extends Document {

    private String content;

    public PdfDocument(String content, PrinterDriver driver) {
        super(driver);
        this.content = content;
    }

    @Override
    public void print() {
        // Pdf için ekstra işlemler (sayfa ayarla, font embed vs.) olabilir
        System.out.println(">>> PDF Belgesi Yazdırılıyor:");
        driver.printData("PDF İçerik: " + content);
    }
}
