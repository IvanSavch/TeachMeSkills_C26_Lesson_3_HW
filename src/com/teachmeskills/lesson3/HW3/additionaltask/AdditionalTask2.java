package com.teachmeskills.lesson3.HW3.additionaltask;

import java.util.Map;
import java.util.Scanner;

public class AdditionalTask2 {
    /*
    Не могу понять почему он кидает на default?
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure;
        boolean isTrue = true;
        while (isTrue) {
            figure = scanner.nextLine();
            switch (figure) {
                case "triangle":
                    System.out.println("enter sides triangle: ");
                    int sideTriangleA = scanner.nextInt();
                    int sideTriangleB = scanner.nextInt();
                    int sideTriangleC = scanner.nextInt();
                    int p = (sideTriangleA + sideTriangleB + sideTriangleC) / 2;
                    double squareOfTheTriangle = Math.sqrt(p * (p - sideTriangleA) * (p - sideTriangleB) * (p - sideTriangleC));
                    System.out.println("square of the triangle = " + squareOfTheTriangle);
                    break;
                case "square":
                    System.out.println("enter side square: ");
                    int sides = scanner.nextInt();
                    double areaOfTheSquare = Math.pow(sides, 2);
                    System.out.println("Area of the square = " + areaOfTheSquare);
                    break;
                case "rectangle":
                    System.out.println("enter side rectangle: ");
                    int sideRectangleA = scanner.nextInt();
                    int sideRectangleB = scanner.nextInt();
                    int squareOfTheRectangle = sideRectangleA * sideRectangleB;
                    System.out.println("square of the rectangle = " + squareOfTheRectangle);
                    break;
                case "circle":
                    System.out.println("enter side circle: ");
                    int radius = scanner.nextInt();
                    double squareOfTheCircle = Math.PI * Math.pow(radius, 2);
                    System.out.println("square of yhe circle = " + squareOfTheCircle);
                    break;
                case "e" :
                    isTrue = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
