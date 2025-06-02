package creational.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {

    // Tek örneği tutacağımız değişken
    private static Logger instance;

    // Log dosyasına yazmak için örneğin bir FileWriter olabilir
    private FileWriter writer;

    // Constructor private
    private Logger() {
        try {
            // Örnek: logs.txt isimli dosyayı aç
            writer = new FileWriter("logs.txt", true); // append modu
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Thread-safe olmaması riski var; daha sonra gösterelim.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Basit log metodu
    public void log(String message) {
        try {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
