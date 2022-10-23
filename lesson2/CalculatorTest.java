package lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator;
        Scanner scanner = new Scanner(System.in);

        String nextIteration;

        do {
            int a;
            int b;
            char sign;

            System.out.print("\nВведите первое число: ");
            a = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите знак математической операции: ");
            sign = scanner.nextLine().charAt(0);

            System.out.print("Введите второе число: ");
            b = scanner.nextInt();
            scanner.nextLine();

            calculator = new Calculator(a, b, sign);
            calculator.calculate();
            System.out.println(calculator.toString());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                nextIteration = scanner.nextLine();
            } while (!(nextIteration.equals("yes") || nextIteration.equals("no")));

        } while (nextIteration.equals("yes"));

        scanner.close();
    }
}
