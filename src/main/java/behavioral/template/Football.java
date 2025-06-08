/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.template;

/**
 *
 * @author Panda
 */
public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football için saha çiziliyor.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football başladı: Maç başlıyor.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football bitti: Kazanan ilan ediliyor.");
    }

}
