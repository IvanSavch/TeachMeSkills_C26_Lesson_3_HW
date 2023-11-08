package com.teachmeskills.lesson3.HW3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(" четное ");
        } else {
            System.out.println("не четное ");
        }

    }
}
