package lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a;
            int b;
            char sign;
            String nextExecution;

            System.out.print("\nВведите первое число: ");
            a = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите знак математической операции: ");
            sign = scanner.nextLine().charAt(0);

            System.out.print("Введите второе число: ");
            b = scanner.nextInt();
            scanner.nextLine();

            calculator = new Calculator(a, b, sign);
            calculator.execute();
            System.out.println(calculator.toString());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                nextExecution = scanner.nextLine();
            } while (!(nextExecution.equals("yes") || nextExecution.equals("no")));
            
            if (nextExecution.equals("no")) {
                break;
            }
        }

        scanner.close();
    }
}
