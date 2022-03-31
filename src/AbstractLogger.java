

public abstract class AbstractLogger {
    LoggingLevel level;

    public AbstractLogger(LoggingLevel level) {
        this.level = level;
    }

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LoggingLevel level, String message) {
        if (this.level.value <= level.value) {
            printLog(message);
        }
        if (this.nextLogger != null) {
            this.nextLogger.logMessage(level, message);
        }
    }



    abstract protected void printLog(String message);

}
