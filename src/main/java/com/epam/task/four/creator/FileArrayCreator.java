package com.epam.task.four.creator;

import com.epam.task.four.data.DataAcquirer;
import com.epam.task.four.data.DataAcquirerFactory;
import com.epam.task.four.data.DataAcquirerType;
import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.exception.ParserException;
import com.epam.task.four.model.CustomIntArray;
import com.epam.task.four.parser.InputStringParser;

public class FileArrayCreator implements ArrayCreator {

    @Override
    public CustomIntArray create() throws ParserException, CustomArrayException {

        DataAcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = factory.dataAcquirerCreator(DataAcquirerType.FILE);
        String inputString = dataAcquirer.getData();

        InputStringParser parser = new InputStringParser();
        int [] inputArray = parser.toIntArray(inputString);


        return new CustomIntArray(inputArray);
    }
}
