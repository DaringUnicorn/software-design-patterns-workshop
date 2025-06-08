/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.state;

/**
 *
 * @author Panda
 */
public class StoppedState implements State {

    @Override
    public void play(AudioPlayer player) {
        System.out.println("Çalar başlatılıyor...");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Çalar durdurulmuş, önce başlatılmalı.");
    }

    @Override
    public void stop(AudioPlayer player) {
        System.out.println("Zaten durdurulmuş durumda.");
    }
}
