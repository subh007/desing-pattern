package org.app.subh.org.app.subh.pattern.chainofresponsibility;

/**
 * Created by subh on 18/04/17.
 */
public class DebugLogger extends AbstractLogger{
    public void printLog(LogLevel logLevel, String msg) {
        if (logLevel == LogLevel.DEBUG) {
            System.out.println("debug :" + msg);
        } else {
            if (nextLogger != null) {
                nextLogger.printLog(logLevel,msg);
            }
        }
    }
}
