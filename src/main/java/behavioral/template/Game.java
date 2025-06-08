/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.template;

/**
 *
 * @author Panda
 */
public abstract class Game {

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();
}
