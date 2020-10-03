package com.epam.task.four.view;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(CustomIntArray customIntArray) throws CustomArrayException {
        for (int i = 0; i < customIntArray.length(); i++) {
            System.out.println(customIntArray.getElement(i));
        }
    }
}
