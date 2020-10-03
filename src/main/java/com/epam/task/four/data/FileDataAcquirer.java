package com.epam.task.four.data;


import com.epam.task.four.exception.CustomArrayException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {

    private final String fileLocation;

    public FileDataAcquirer(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public String getData() throws CustomArrayException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation))) {

            String sCurrentLine;
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new CustomArrayException("Error reading the file.");
        }
        return contentBuilder.toString();
    }
}


