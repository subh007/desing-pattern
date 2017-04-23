package org.app.subh.org.app.subh.pattern.chainofresponsibility;

/**
 * Created by subh on 18/04/17.
 */
public abstract class AbstractLogger {

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger = abstractLogger;
    }

    public abstract void printLog(LogLevel logLevel, String msg);
}
