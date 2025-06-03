/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class TextDocument extends Document {

    private String text;

    public TextDocument(String text, PrinterDriver driver) {
        super(driver);
        this.text = text;
    }

    @Override
    public void print() {
        // Düz metin yazdırma adımları
        System.out.println(">>> Metin Belgesi Yazdırılıyor:");
        driver.printData("Text İçerik: " + text);
    }
}
