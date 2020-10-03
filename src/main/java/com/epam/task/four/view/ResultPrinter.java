package com.epam.task.four.view;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;

public interface ResultPrinter {
    void print(CustomIntArray customIntArray) throws CustomArrayException;
}
