package com.teachmeskills.lesson3.HW3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature > -20) {
            System.out.println("Normal");
        } else System.out.println("Cold");

    }
}
