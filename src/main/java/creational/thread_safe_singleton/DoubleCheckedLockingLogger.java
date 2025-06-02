package creational.thread_safe_singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoubleCheckedLockingLogger {

    private static volatile DoubleCheckedLockingLogger instance; // volatile: bellek görünürlüğü için

    private FileWriter writer;

    private DoubleCheckedLockingLogger() {
        try {
            writer = new FileWriter("logs.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DoubleCheckedLockingLogger getInstance() {
        if (instance == null) { // Birinci kontrol (kilitleme öncesi)
            synchronized (DoubleCheckedLockingLogger.class) {
                if (instance == null) { // İkinci kontrol (kilitleme sonrası)
                    instance = new DoubleCheckedLockingLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
