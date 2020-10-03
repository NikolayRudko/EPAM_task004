package com.epam.task.four.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    @Override
    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the int array through a space.");

        return scanner.nextLine();
    }
}
