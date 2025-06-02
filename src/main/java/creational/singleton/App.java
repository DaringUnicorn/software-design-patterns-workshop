package creational.singleton;


public class App {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Uygulama başladı.");

        // Farklı bir sınıftan yine aynı Logger örneğini alırız
        new SomeService().performAction();
    }
}

