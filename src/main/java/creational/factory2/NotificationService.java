/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory2;

public class NotificationService {

    public static void main(String[] args) {
        // Runtime’da seçilen bildirim türü (örnek: "EMAIL", "SMS", "PUSH")
        String notificationType = args.length > 0 ? args[0] : "EMAIL";
        String userAddress = "user@example.com";
        String msg = "Kanka, Factory Method desenini test ediyorum!";

        NotificationFactory factory;
        if (notificationType.equalsIgnoreCase("SMS")) {
            factory = new SmsNotificationFactory();
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            factory = new PushNotificationFactory();
        } else {
            factory = new EmailNotificationFactory();
        }

        // Burada notifyUser, createNotification() aracılığıyla somut Notification aldığımız yerdir
        factory.notifyUser(userAddress, msg);
    }
}
