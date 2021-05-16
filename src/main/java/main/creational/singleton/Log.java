package main.creational.singleton;

public final class Log {

    private volatile static Log log;

    private final String logMessage;

    private Log(String logMessage) {
        this.logMessage = logMessage;
        System.out.println(this.logMessage);
    }


    public static Log getInstance(String logMessage) {
        if (log != null) {
            return log;
        }
        synchronized (Log.class) {
            if (log == null) {
                log = new Log(logMessage);
            }
            return log;
        }
    }

    public String getLogMessage() {
        return logMessage;
    }
}
