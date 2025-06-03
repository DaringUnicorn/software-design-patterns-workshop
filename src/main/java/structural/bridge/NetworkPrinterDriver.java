/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class NetworkPrinterDriver implements PrinterDriver {

    @Override
    public void printData(String data) {
        System.out.println("[Network Printer] Veri gönderiliyor: " + data);
        // Burada Ağ protokolüyle yazdırma kodu (IP, port vs.) olurdu
    }
}
