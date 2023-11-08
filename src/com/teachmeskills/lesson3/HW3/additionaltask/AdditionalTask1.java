package com.teachmeskills.lesson3.HW3.additionaltask;

import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonachiNumber = scanner.nextInt();
        long sum = 1;
        int counter = 2;
        while (counter <= fibonachiNumber) {
            if (fibonachiNumber > 100) {
                break;
            }
            sum = sum * counter;
            System.out.println(sum);
            counter++;
        }
    }
}
