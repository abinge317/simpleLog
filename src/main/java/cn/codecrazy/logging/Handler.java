package cn.codecrazy.logging;

public abstract class Handler {
    private Formatter formatter;

    protected Handler() {
    }

    public Formatter getFormatter() {
        return formatter;
    }

    public void setFormater(Formatter formatter) {
        this.formatter = formatter;
    }

    public abstract void publish(LogRecord logRecord);
}
