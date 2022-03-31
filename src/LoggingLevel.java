public enum LoggingLevel {
    INFO(0), DEBUG(1), WARN(2), ERROR(3);
    int value;

    LoggingLevel(int value) {
        this.value = value;
    }
}
