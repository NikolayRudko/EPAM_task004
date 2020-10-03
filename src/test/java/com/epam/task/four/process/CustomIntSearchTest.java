package com.epam.task.four.process;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;
import org.junit.Assert;
import org.junit.Test;

public class CustomIntSearchTest {

    @Test
    public void primeNumbersTestShouldFindAllPrimeNumbers() throws CustomArrayException {
        //given
        CustomIntArray originArray = new CustomIntArray(new int[]{1, 2, 6, 4, 3, 5, 7, 8, 9});
        CustomIntArray actualPrimeArray = new CustomIntArray(new int[]{2, 3, 5, 7});
        CustomIntSearch search = new CustomIntSearch();

        //when
        CustomIntArray expectedPrimeArray = search.primeNumbers(originArray);

        //then
        Assert.assertEquals(expectedPrimeArray,actualPrimeArray);

    }
}