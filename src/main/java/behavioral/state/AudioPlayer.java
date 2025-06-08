/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.state;

/**
 *
 * @author Panda
 */
class AudioPlayer {

    private State state;

    public AudioPlayer() {
        this.state = new StoppedState();
    }

    void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.play(this);
    }

    public void pressPause() {
        state.pause(this);
    }

    public void pressStop() {
        state.stop(this);
    }
}
