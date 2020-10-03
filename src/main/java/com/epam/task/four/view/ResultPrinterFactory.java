package com.epam.task.four.view;

public class ResultPrinterFactory {
    public ResultPrinter createPrinter (PrintType type){
        switch (type) {
            case CONSOLE:
                return new ConsoleResultPrinter();
            case FILE:
                return new FileResultPrinter();
            default:
                throw new IllegalArgumentException("Unknown data type.");
        }
    }
}
