/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Panda
 */
public class ChatRoom implements ChatMediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User u : this.users) {
            if (u != sender) {
                u.receive(message);
            }
        }
    }

}
