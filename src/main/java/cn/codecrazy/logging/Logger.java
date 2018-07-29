package cn.codecrazy.logging;

public class Logger {
    private static Handler handler = new ConsoleHandler();
    private static Logger logger = null;
    private static int levelValue = LogLevel.INFO.intValue();

    private Logger() {
    }

    public static Logger getLogger() {
        if(logger == null) {
            synchronized (Logger.class) {
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void trace(String message) {
        LogRecord logRecord = new LogRecord(message);
        logRecord.setLogLevel(LogLevel.TRACE);
        doLog(logRecord);
    }

    public void debug(String message) {
        LogRecord logRecord = new LogRecord(message);
        logRecord.setLogLevel(LogLevel.DEBUG);
        doLog(logRecord);
    }

    public void info(String message) {
        LogRecord logRecord = new LogRecord(message);
        logRecord.setLogLevel(LogLevel.INFO);
        doLog(logRecord);
    }

    public void warn(String message) {
        LogRecord logRecord = new LogRecord(message);
        logRecord.setLogLevel(LogLevel.WARNING);
        doLog(logRecord);
    }

    public void error(String message) {
        LogRecord logRecord = new LogRecord(message);
        logRecord.setLogLevel(LogLevel.ERROR);
        doLog(logRecord);
    }

    private void doLog(LogRecord logRecord) {
        if(!isLoggable(logRecord.getLogLevel())) {
            return;
        }
        handler.publish(logRecord);
    }

    private boolean isLoggable(LogLevel logLevel) {
        if(logLevel.intValue() < levelValue) {
            return false;
        }
        return true;
    }
}
