public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(LoggingLevel level) {
        super(level);
    }

    public void printLog(String message) {
        System.out.println("[ERROR] " + message);
    }
}
