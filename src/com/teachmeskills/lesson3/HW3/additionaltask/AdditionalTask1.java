package com.teachmeskills.lesson3.HW3.additionaltask;

import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonachiNumber = scanner.nextInt();
        int counter = 0;
        int numberOne = 1;
        int numberTwo = 1;
        int fibanachi;
        while (counter < fibonachiNumber) {
            if (fibonachiNumber >100) {
                break;
            }
            fibanachi = numberOne + numberTwo;
            System.out.println(fibanachi);
            numberOne = numberTwo;
            numberTwo = fibanachi;
            counter++;
        }
    }
}
