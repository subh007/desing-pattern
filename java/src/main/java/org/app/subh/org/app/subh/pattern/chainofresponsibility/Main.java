package org.app.subh.org.app.subh.pattern.chainofresponsibility;

/**
 * Created by subh on 18/04/17.
 */
public class Main {

    public static DebugLogger setupLoggerChain() {
        // set up the chanin
        DebugLogger debugLogger = new DebugLogger();
        ErroLogger erroLogger = new ErroLogger();
        InfoLogger infoLogger = new InfoLogger();

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(erroLogger);

        return debugLogger;
    }

    public static void main(String[] args) {
        // this is example for chain of responsibility
        // log level error > info > debug



        AbstractLogger abstractLogger = setupLoggerChain();
        abstractLogger.printLog(LogLevel.DEBUG, "this should be debug");
        abstractLogger.printLog(LogLevel.INFO, "this shoudl be info log");
        abstractLogger.printLog(LogLevel.ERROR, "this shoudl be error log");
    }
}
