package com.epam.task.four.creator;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.exception.ParserException;
import com.epam.task.four.model.CustomIntArray;

public interface ArrayCreator {
    CustomIntArray create() throws CustomArrayException, ParserException;
}
