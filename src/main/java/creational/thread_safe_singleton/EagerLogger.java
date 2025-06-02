package creational.thread_safe_singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EagerLogger {

    private static final EagerLogger instance = new EagerLogger();

    private FileWriter writer;

    private EagerLogger() {
        try {
            writer = new FileWriter("logs.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(EagerLogger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static EagerLogger getInstance() {
        return instance;
    }
    
}
