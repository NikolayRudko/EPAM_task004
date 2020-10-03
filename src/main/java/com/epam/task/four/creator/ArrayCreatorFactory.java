package com.epam.task.four.creator;

public class ArrayCreatorFactory {
    public ArrayCreator arrayCreator(InputType type){
        switch (type){
            case FILE:
                return new FileArrayCreator();
            case CONSOLE:
                return new ConsoleArrayCreator();
            case RANDOM:
                return new RandomArrayCreator();
            default:
                throw new IllegalArgumentException();
        }
    }
}
