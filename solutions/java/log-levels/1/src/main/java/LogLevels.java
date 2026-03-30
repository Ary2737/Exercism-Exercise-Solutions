public class LogLevels {
    
    public static String message(String logLine) {
        String dividor = ":";
        String[] parts = logLine.split(dividor);

        return parts[1].trim();

    }

    public static String logLevel(String logLine) {
        String dividor = ":";
        String[] parts = logLine.split(dividor);

        return parts[0].replace("[","").replace("]","").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
        
    }
}
