package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continuation;

        do {
            System.out.print("\nВведите первое число: ");
            int a = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.nextLine().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            Calculator calculator = new Calculator(a, b, sign);
            calculator.calculate();
            System.out.println(a + " " + sign + " " + b + " = " + calculator.getResult());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continuation = scanner.nextLine();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
        } while (continuation.equals("yes"));

        scanner.close();
    }
}
