package decorator.factory.calculator.log.impl;

import java.time.LocalDateTime;

import decorator.factory.calculator.log.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String text) {
        System.err.println(LocalDateTime.now() + ": " + text);
    }
}
