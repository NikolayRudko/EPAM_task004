package com.epam.task.four.creator;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;

public class RandomArrayCreator implements ArrayCreator {
    @Override
    public CustomIntArray create() throws CustomArrayException {
        final int size = 10;
        final int min = 0;
        final int max = 10;
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            randomArray[i] = min + (int) (Math.random() * max);
        }

        return new CustomIntArray(randomArray);
    }
}
