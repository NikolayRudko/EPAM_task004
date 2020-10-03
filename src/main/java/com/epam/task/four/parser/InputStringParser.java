package com.epam.task.four.parser;

import com.epam.task.four.exception.ParserException;

public class InputStringParser {
    public int[] toIntArray(String inputData) throws ParserException {
        if (inputData == null) {
            throw new ParserException("Input data are empty!");
        }

        final String SEPARATOR = "\\s+";
        String[] inputArray = inputData.split(SEPARATOR);
        int[] output = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            output[i] = Integer.parseInt(inputArray[i]);
        }

        return output;
    }
}
