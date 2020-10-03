package com.epam.task.four.process;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;

public interface CustomIntSort {
    CustomIntArray SortUp(CustomIntArray array) throws CustomArrayException;
    CustomIntArray SortDown(CustomIntArray array) throws CustomArrayException;
}
