package com.epam.task.four.data;

import com.epam.task.four.exception.CustomArrayException;

public interface DataAcquirer {
    String getData() throws CustomArrayException;
}
