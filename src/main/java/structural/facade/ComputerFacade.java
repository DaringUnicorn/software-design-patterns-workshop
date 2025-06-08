/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.facade;

/**
 *
 * @author Panda
 */
public class ComputerFacade {

    private static final long BOOT_ADDRESS = 0x1000;
    private static final long BOOT_SECTOR = 0x01;
    private static final int SECTOR_SIZE = 512;

    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        byte[] bootData = hd.read(BOOT_SECTOR, SECTOR_SIZE);
        ram.load(BOOT_ADDRESS, bootData);
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
