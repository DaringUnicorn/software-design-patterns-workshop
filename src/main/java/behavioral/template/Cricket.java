/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.template;

/**
 *
 * @author Panda
 */
public class Cricket extends Game {

    @Override
    protected void initialize() {
        System.out.println("Cricket için stadyum hazırlanıyor.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket başladı: Top atışı yapılıyor.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket bitti: Skor kaydediliyor.");
    }

}
