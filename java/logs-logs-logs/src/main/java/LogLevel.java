public enum LogLevel {

    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    public int getI() {
        return i;
    }

    final int i;

    LogLevel(int i) {
        this.i = i;
    }
}
