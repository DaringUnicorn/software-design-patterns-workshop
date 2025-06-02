/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory2;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
