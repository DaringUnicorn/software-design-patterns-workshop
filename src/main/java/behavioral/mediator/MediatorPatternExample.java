/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.mediator;

/**
 *
 * @author Panda
 */
public class MediatorPatternExample {

    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");
        User charlie = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        alice.send("Merhaba herkese!");
        bob.send("Selam Alice!");
    }

}
