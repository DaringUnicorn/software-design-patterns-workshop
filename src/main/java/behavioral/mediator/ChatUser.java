/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.mediator;

/**
 *
 * @author Panda
 */
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }

}
