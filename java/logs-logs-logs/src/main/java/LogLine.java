public class LogLine {
    String logline;

    public LogLine(String logLine) {
        this.logline = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevelCode = logline.substring(1, 4);
        return switch (logLevelCode) {
            case "INF" -> LogLevel.INFO;
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    String getMessage() {
        return logline.substring(7);
    }

    String getOutputForShortLog() {
        return getLogLevel().getI() + ":" + getMessage();
    }

}
