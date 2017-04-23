package org.app.subh.org.app.subh.pattern.chainofresponsibility;

/**
 * Created by subh on 18/04/17.
 */
public class ErroLogger extends AbstractLogger{
    public void printLog(LogLevel logLevel, String msg) {
        if(logLevel == LogLevel.ERROR) {
            System.out.println("error :" + msg);
        } else {
            if (nextLogger != null) {
                nextLogger.printLog(logLevel, msg);
            }
        }
    }
}
