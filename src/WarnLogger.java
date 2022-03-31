public class WarnLogger extends AbstractLogger {
        public WarnLogger(LoggingLevel level) {
            super(level);
        }


        public void printLog(String message) {
            System.out.println("[WARN] " + message);
        }
}
