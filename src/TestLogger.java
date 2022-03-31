import java.util.AbstractList;

public class TestLogger {
    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();

        logger.logMessage(LoggingLevel.WARN, "This is an issue");


    }

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger infoLogger = new InfoLogger(LoggingLevel.INFO);
        AbstractLogger debugLogger = new DebugLogger(LoggingLevel.DEBUG);
        AbstractLogger warnLogger = new WarnLogger(LoggingLevel.WARN);
        AbstractLogger errorLogger = new ErrorLogger(LoggingLevel.ERROR);


        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(warnLogger);
        warnLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
