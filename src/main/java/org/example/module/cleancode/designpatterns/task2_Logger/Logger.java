package org.example.module.cleancode.designpatterns.task2_Logger;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static void setLogger(Logger logger) {
        Logger.logger = logger;
    }
}
