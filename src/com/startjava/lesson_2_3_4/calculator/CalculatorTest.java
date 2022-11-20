package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continuation = "yes";

        do {
            System.out.print("\nВведите математическое выражение: ");
            String expression = scanner.nextLine();
            String[] elements = expression.split("\s");
            if (elements.length != 3) {
                System.out.println("Введено выражение, которое не соответствует требуемому формату");
                continue;
            }
            try {
                int a = Integer.parseInt(elements[0]);
                char sign = elements[1].charAt(0);
                int b = Integer.parseInt(elements[2]);

                if (!(a > 0 && b > 0)) {
                    throw new NumberFormatException();
                }

                Calculator calculator = new Calculator(a, b, sign);
                calculator.calculate();
            } catch (NumberFormatException e) {
                System.out.println("Введены неверные операнды. Операнды должны являться целыми" +
                        " положительными числами");
                continue;
            } catch (Exception e) {
                System.out.println("Введен неверный метематический оператор");
                continue;
            }

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continuation = scanner.nextLine();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
        } while (continuation.equals("yes"));

        scanner.close();
    }
}
