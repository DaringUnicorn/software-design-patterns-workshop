/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.state;

/**
 *
 * @author Panda
 */
public class StatePatternExample {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.pressPlay();
        player.pressPause();
        player.pressPlay();
        player.pressStop();
        player.pressStop();
    }

}
