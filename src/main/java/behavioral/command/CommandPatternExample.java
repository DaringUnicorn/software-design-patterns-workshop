/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.command;

/**
 *
 * @author Panda
 */
public class CommandPatternExample {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        RemoteControl remote = new RemoteControl();

        Command lightOn = new LightOnCommand(livingRoomLight);
        remote.setCommand(lightOn);
        remote.pressButton();

        Command lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommand(lightOff);
        remote.pressButton();

    }

}
