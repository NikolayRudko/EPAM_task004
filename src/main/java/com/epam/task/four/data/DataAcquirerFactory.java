package com.epam.task.four.data;

public class DataAcquirerFactory {
    private static final String FILE_PATH = "src/main/resources/inputArray.txt";

    public DataAcquirer dataAcquirerCreator(DataAcquirerType type){
        switch (type){
            case FILE:
                return new FileDataAcquirer(FILE_PATH);
            case CONSOLE:
                return new ConsoleDataAcquirer();
            default:
                throw new IllegalArgumentException();
        }
    }
}
