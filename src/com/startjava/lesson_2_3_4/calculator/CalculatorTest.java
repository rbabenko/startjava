package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continuation;

        do {
            System.out.print("\nВведите математическое выражение: ");
            String expression = scanner.nextLine();
            Calculator.calculate(expression);

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continuation = scanner.nextLine();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
        } while (continuation.equals("yes"));

        scanner.close();
    }
}
