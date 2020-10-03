package com.epam.task.four;

import com.epam.task.four.process.CustomIntSearch;
import com.epam.task.four.creator.ArrayCreator;
import com.epam.task.four.creator.ArrayCreatorFactory;
import com.epam.task.four.creator.InputType;
import com.epam.task.four.exception.CustomArrayException;
import com.epam.task.four.exception.ParserException;
import com.epam.task.four.model.CustomIntArray;
import com.epam.task.four.process.CustomIntSort;
import com.epam.task.four.process.CustomIntSortInsertion;
import com.epam.task.four.view.PrintType;
import com.epam.task.four.view.ResultPrinter;
import com.epam.task.four.view.ResultPrinterFactory;

public class Main {
    public static void main(String[] args) {
       try {
           process();

       }catch (CustomArrayException | ParserException exception ){
            exception.printStackTrace();
        }
    }

    private static void process() throws CustomArrayException, ParserException {
        //input
        ArrayCreatorFactory arrayCreatorFactory = new ArrayCreatorFactory();
        //ArrayCreator arrayCreator = arrayCreatorFactory.arrayCreator(InputType.CONSOLE);
        //ArrayCreator arrayCreator = arrayCreatorFactory.arrayCreator(InputType.FILE);
        ArrayCreator arrayCreator = arrayCreatorFactory.arrayCreator(InputType.RANDOM);
        CustomIntArray customArray = arrayCreator.create();

        //sort
        CustomIntSort customIntSort = new CustomIntSortInsertion();
        CustomIntArray sortArray = customIntSort.SortUp(customArray);

        //find
        CustomIntSearch customIntSearch = new CustomIntSearch();
        CustomIntArray primeArray = customIntSearch.primeNumbers(customArray);

        //output
        ResultPrinterFactory resultPrinterFactory = new ResultPrinterFactory();
        ResultPrinter fileResultPrinter = resultPrinterFactory.createPrinter(PrintType.FILE);
        ResultPrinter consoleResultPrinter = resultPrinterFactory.createPrinter(PrintType.CONSOLE);

        //print
        fileResultPrinter.print(customArray);
        consoleResultPrinter.print(customArray);

        fileResultPrinter.print(sortArray);
        consoleResultPrinter.print(sortArray);

        fileResultPrinter.print(primeArray);
        consoleResultPrinter.print(primeArray);
    }
}
