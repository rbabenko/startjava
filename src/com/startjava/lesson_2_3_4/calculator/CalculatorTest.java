package com.startjava.lesson_2_3_4.calculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nВведите математическое выражение: ");
            String expression = scanner.nextLine();
            try {
                System.out.println(expression + " = " + Calculator.calculate(expression));
            } catch (NoSuchElementException e) {
                System.out.println("Введено выражение, которое не соответствует требуемому формату. Просьба " +
                        "ввести корректное выражение");
            } catch (NumberFormatException e) {
                System.out.println("Операнды должны быть целыми положительными числами. Просьба ввести" +
                        " корректные значения");
            } catch (IllegalStateException e) {
                System.out.println("Введен неверный метематический оператор. Просьба ввести корректный оператор");
            }

            if (!continueCalculation()) {
                break;
            }
        } while (true);

        scanner.close();
    }

    private static boolean continueCalculation() {
        Scanner scanner = new Scanner(System.in);
        String continuation;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            continuation = scanner.nextLine();
        } while (!continuation.equals("yes") && !continuation.equals("no"));
        return continuation.equals("yes");
    }
}
