package com.epam.task.four.process;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;
import org.junit.Assert;
import org.junit.Test;

public class CustomIntSortInsertionTest {

    @Test
    public void sortUpTestShouldSortUpArray() throws CustomArrayException {
        //given
        CustomIntArray unSortArray = new CustomIntArray(new int[]{9, 8, 7, 5, 6, 4, 3, 2, 1});
        CustomIntArray actualSortArray = new CustomIntArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        CustomIntSort customIntSort = new CustomIntSortInsertion();

        //when
        CustomIntArray expectedSortArray = customIntSort.SortUp(unSortArray);

        //then
        Assert.assertEquals(expectedSortArray, actualSortArray);
    }

    @Test
    public void sortDownTestShouldSortDownArray() throws CustomArrayException {
        //given
        CustomIntArray unSortArray = new CustomIntArray(new int[]{1, 2, 6, 4, 5, 3, 7, 8, 9});
        CustomIntArray actualSortArray = new CustomIntArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        CustomIntSort customIntSort = new CustomIntSortInsertion();

        //when
        CustomIntArray expectedSortArray = customIntSort.SortDown(unSortArray);

        //then
        Assert.assertEquals(expectedSortArray, actualSortArray);
    }
}