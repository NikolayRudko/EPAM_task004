package com.epam.task.four.parser;

import com.epam.task.four.exception.ParserException;
import org.junit.Assert;
import org.junit.Test;

public class StringParserTest {

    @Test
    public void toIntArrayTestShouldParseStringToIntArray() throws ParserException {
        //given
        int[] actual = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String input = "1 2 3 4 5 6 7 8 9";
        InputStringParser parser = new InputStringParser();

        //when
        int[] expected = parser.toIntArray(input);

        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void toIntArrayTestShouldThrowNumberFormatException() throws ParserException {
        //given
        int[] actual = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String input = "1 2 3 4 5 6 7 8 F";
        InputStringParser parser = new InputStringParser();

        //when
        int[] expected = parser.toIntArray(input);
    }

    @Test(expected = ParserException.class)
    public void toIntArrayTestShouldThrowParserException() throws ParserException {
        //given
        int[] actual = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        InputStringParser parser = new InputStringParser();

        //when
        int[] expected = parser.toIntArray(null);
    }
}