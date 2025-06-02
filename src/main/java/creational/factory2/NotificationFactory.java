/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory2;

/**
 *
 * @author Panda
 */
public abstract class NotificationFactory {

    public abstract Notification createNotification();

    public void notifyUser(String to, String message) {
        Notification notification = createNotification();
        notification.send(to, message);
    }
}
