package cn.codecrazy.logging;

import java.util.Date;

public class SimpleFormatter implements Formatter {

    @Override
    public String format(LogRecord logRecord) {
        return "[" + logRecord.getLogLevel().toString() + "] - " + new Date(logRecord.getMillis()) + " - " + logRecord.getMessage();
    }
}
