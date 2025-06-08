package structural.facade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Panda
 */
public class CPU {

    public void freeze() {
        System.out.println("CPU donduruldu.");
    }

    public void jump(long position) {
        System.out.println("CPU atlama: konum = " + position);
    }

    public void execute() {
        System.out.println("CPU yürütme başlatıldı.");
    }
}
