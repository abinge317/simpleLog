package cn.codecrazy.logging;

public enum LogLevel {
    TRACE(1),
    DEBUG(3),
    INFO(5),
    WARNING(7),
    ERROR(10);

    private int val;
    LogLevel(int val) {
        this.val = val;
    }
    public int intValue() {
        return this.val;
    }
}
