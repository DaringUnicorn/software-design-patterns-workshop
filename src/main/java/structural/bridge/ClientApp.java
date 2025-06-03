/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.bridge;

/**
 *
 * @author Panda
 */
public class ClientApp {

    public static void main(String[] args) {
        // 1) USB sürücü ile PDF belgesi yazdır
        PrinterDriver usbDriver = new UsbPrinterDriver();
        Document pdf = new PdfDocument("Bridge Pattern Örneği", usbDriver);
        pdf.print();
        // Ekrana:
        // >>> PDF Belgesi Yazdırılıyor:
        // [USB Printer] Veri gönderiliyor: PDF İçerik: Bridge Pattern Örneği

        System.out.println();

        // 2) Bluetooth sürücü ile Text belgesi yazdır
        PrinterDriver btDriver = new BluetoothPrinterDriver();
        Document txt = new TextDocument("Merhaba Kanka!", btDriver);
        txt.print();
        // Ekrana:
        // >>> Metin Belgesi Yazdırılıyor:
        // [Bluetooth Printer] Veri gönderiliyor: Text İçerik: Merhaba Kanka!

        System.out.println();

        // 3) Ağ sürücüsü ile PDF belgesi yazdır
        PrinterDriver netDriver = new NetworkPrinterDriver();
        Document pdf2 = new PdfDocument("Başka bir PDF", netDriver);
        pdf2.print();
        // Ekrana:
        // >>> PDF Belgesi Yazdırılıyor:
        // [Network Printer] Veri gönderiliyor: PDF İçerik: Başka bir PDF
    }
}
