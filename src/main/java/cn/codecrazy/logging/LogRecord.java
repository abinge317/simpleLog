package cn.codecrazy.logging;

public class LogRecord {
    private String loggerName;
    private String message;
    private LogLevel logLevel;
    private long millis;

    public LogRecord(String message) {
        this.message = message;
        this.millis = System.currentTimeMillis();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public long getMillis() {
        return millis;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }
}
