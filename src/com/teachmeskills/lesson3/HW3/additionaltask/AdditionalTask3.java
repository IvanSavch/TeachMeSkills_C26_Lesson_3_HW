package com.teachmeskills.lesson3.HW3.additionaltask;

import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int ost;

        while (number != 0) {
            ost = number % 10;
            sum += ost;
            number = number/10;
        }
        System.out.println(sum);

    }
}
