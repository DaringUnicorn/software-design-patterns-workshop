/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.state;

/**
 *
 * @author Panda
 */
public class PlayingState implements State {

    @Override
    public void play(AudioPlayer player) {
        System.out.println("Zaten oynatılıyor.");
    }

    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Çalar duraklatılıyor...");
        player.setState(new PausedState());
    }

    @Override
    public void stop(AudioPlayer player) {
        System.out.println("Çalar durduruluyor...");
        player.setState(new StoppedState());
    }
}
