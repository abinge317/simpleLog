package cn.codecrazy.logging;

import java.io.PrintStream;

public class ConsoleHandler extends Handler {

    private PrintStream printStream = System.out;

    public ConsoleHandler() {
        setFormater(new SimpleFormatter());
    }

    public void publish(LogRecord logRecord) {
        printStream.println(getFormatter().format(logRecord));
    }
}
