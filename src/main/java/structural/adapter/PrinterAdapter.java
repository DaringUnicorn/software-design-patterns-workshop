/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter;

/**
 *
 * @author Panda
 */
public class PrinterAdapter implements ModernPrinter {

    private OldPrinter adaptee;

    public PrinterAdapter(OldPrinter adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void print(String message) {
        adaptee.printData(message);
    }

}
