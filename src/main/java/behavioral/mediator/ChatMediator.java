/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.mediator;

/**
 *
 * @author Panda
 */
public interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);
}
