package creational.thread_safe_singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;

public class SynchronizedLogger {

    private static SynchronizedLogger instance;
    private FileWriter writer;

    private SynchronizedLogger() {
        try {
            writer = new FileWriter("logs.txt", true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static synchronized SynchronizedLogger getInstance() {
        if (instance == null) {
            instance = new SynchronizedLogger();
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
