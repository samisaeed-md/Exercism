public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");
        return logLine.substring(index + 1).trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf("[");
        int secondIndex = logLine.indexOf("]");
        return logLine.substring(index + 1,secondIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        int index = logLine.indexOf(":");
        int indexOfLogLevel = logLine.indexOf("[");
        int secondIndexOfLogLevel = logLine.indexOf("]");

        String logLevel = logLine.substring(indexOfLogLevel + 1,secondIndexOfLogLevel);
        return logLine.substring(index + 1).trim() + " " + "(" + logLevel.toLowerCase() + ")";
    }
}
