/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.facade;

/**
 *
 * @author Panda
 */
public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory'e yüklendi: position = " + position + ", data boyutu = " + data.length);
    }

}
