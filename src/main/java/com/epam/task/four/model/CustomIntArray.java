package com.epam.task.four.model;

import com.epam.task.four.exception.CustomArrayException;

public class CustomIntArray {
    private int[] numberArray;

    public CustomIntArray(int[] numberArray) throws CustomArrayException {
        if (numberArray == null) {
            throw new CustomArrayException("A null object was passed on.");
        }
        this.numberArray = numberArray;
    }

    public CustomIntArray(int length) {
        this.numberArray = new int[length];
    }

    public int[] getNumberArray() {
        int[] cloneArray = new int[numberArray.length];
        for (int i = 0; i < cloneArray.length; i++) {
            cloneArray[i] = numberArray[i];
        }
        return cloneArray;
    }

    public void setElement(int element, int index) throws CustomArrayException {
        if (isCorrectIndex(index)) {
            this.numberArray[index] = element;
        } else {
            throw new CustomArrayException(String.format("Array overrun, array size %d, passed index %d.",
                    numberArray.length, index));
        }
    }

    public int getElement(int index) throws CustomArrayException {
        if (isCorrectIndex(index)) {
            return this.numberArray[index];
        } else {
            throw new CustomArrayException(String.format("Array overrun, array size %d, passed index %d.",
                    numberArray.length, index));
        }
    }

    private boolean isCorrectIndex(int index) {
        return index >= 0 && index < numberArray.length;
    }

    public int length() {
        return numberArray.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        CustomIntArray array = (CustomIntArray) obj;

        if (numberArray.length != array.length()) {
            return false;
        }


        // TODO: 28.09.2020 exception
        for (int i = 0; i < array.length(); i++) {

            try {
                if (numberArray[i] != array.getElement(i)) {
                    return false;
                }
            } catch (CustomArrayException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int element : numberArray) {
            result = result + element * 31;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Arrays size - %d,%nElements: %n[ %s]",
                numberArray.length, customArrayInfo());
    }

    private String customArrayInfo() {
        StringBuilder info = new StringBuilder();
        for (int element : numberArray) {
            info.append(element).append(" ");
        }
        return info.toString();
    }
}
