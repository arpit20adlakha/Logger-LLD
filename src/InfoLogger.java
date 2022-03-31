public class InfoLogger extends AbstractLogger {

    public InfoLogger(LoggingLevel level) {
        super(level);
    }

    public void printLog(String message) {
        System.out.println("[INFO] " + message);
    }
}
