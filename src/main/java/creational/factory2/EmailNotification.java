package creational.factory2;

public class EmailNotification implements Notification {

    @Override
    public void send(String to, String message) {
        System.out.println("Email gönderiliyor -> To: " + to + ", Message: " + message);
        // (Gerçekte SMTP kodları vs. buraya)
    }
}
