/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class BluetoothPrinterDriver implements PrinterDriver {

    @Override
    public void printData(String data) {
        System.out.println("[Bluetooth Printer] Veri gönderiliyor: " + data);
        // Burada Bluetooth üzerinden yazdırma kodu olurdu
    }
}
