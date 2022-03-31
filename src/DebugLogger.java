public class DebugLogger extends AbstractLogger {

    public DebugLogger(LoggingLevel level) {
        super(level);
    }
    public void printLog(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
