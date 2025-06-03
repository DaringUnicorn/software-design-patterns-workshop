/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class UsbPrinterDriver implements PrinterDriver {

    @Override
    public void printData(String data) {
        System.out.println("[USB Printer] Veri gönderiliyor: " + data);
        // Burada gerçek USB protokolüyle iletişim kuran kod olurdu
    }
}
