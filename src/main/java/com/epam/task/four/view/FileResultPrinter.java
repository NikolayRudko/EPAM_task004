package com.epam.task.four.view;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileResultPrinter implements ResultPrinter {
    private int number = 0;

    @Override
    public void print(CustomIntArray customIntArray) {
        String outputFile = "Output" + number + ".txt";
        number++;

        File file = new File(outputFile);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < customIntArray.length(); i++) {
                printWriter.printf("%d ", customIntArray.getElement(i));
            }
        } catch (IOException | CustomArrayException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
