/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.builder;

/**
 *
 * @author Panda
 */
public class ClientApp {

    public static void main(String[] args) {
        Computer basicPc = new Computer.Builder("Intel Core i5", 8, 256).build();
        System.out.println("--- Basic PC ---");
        System.out.println(basicPc);

        Computer gamingPc = new Computer.Builder("Intel Core i9", 32, 1024).setGpu("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11 Pro")
                .setWifiEnabled(true)
                .setBluetoothEnabled(true).build();
        
        System.out.println("--- Gaming PC ---");
        System.out.println(gamingPc);
    }
}
