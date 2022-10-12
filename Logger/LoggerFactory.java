package Logger;

public class LoggerFactory {
    
    public static Logger create() {
        return new LoggerImpl();
    }
}

