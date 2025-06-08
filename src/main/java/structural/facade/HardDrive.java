/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.facade;

/**
 *
 * @author Panda
 */
public class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("HardDrive okunuyor: LBA = " + lba + ", size = " + size);
        return new byte[size];
    }

}
