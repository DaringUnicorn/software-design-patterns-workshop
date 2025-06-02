/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory2;

public class SmsNotification implements Notification {

    @Override
    public void send(String to, String message) {
        System.out.println("SMS gönderiliyor -> To: " + to + ", Message: " + message);
        // (Gerçekte SMS API kodları vs. buraya)
    }
}
