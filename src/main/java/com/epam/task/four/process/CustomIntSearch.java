package com.epam.task.four.process;

import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.model.CustomIntArray;

public class CustomIntSearch {
    public CustomIntArray primeNumbers(CustomIntArray array) throws CustomArrayException {

        if (array.length() == 0) {
            return new CustomIntArray(0);
        }

        int countPrimeNumber = 0;
        for (int i = 0; i < array.length(); i++) {
            if (isPrime(array.getElement(i))) {
                countPrimeNumber++;
            }
        }

        if (countPrimeNumber == 0) {
            return new CustomIntArray(0);
        }

        CustomIntArray primeArray = new CustomIntArray(countPrimeNumber);

        int j = 0;
        for (int i = 0; i < array.length(); i++) {
            if (isPrime(array.getElement(i))) {
                primeArray.setElement(array.getElement(i), j);
                j++;
            }
        }

        return primeArray;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
