/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter;

/**
 *
 * @author Panda
 */
public class ClientApp {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        
        ModernPrinter printer = new PrinterAdapter(oldPrinter);
        
        printer.print("Merhaba! Adapter çalışıyor.");
    }
}
