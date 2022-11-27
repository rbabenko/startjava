package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static void calculate(String expression) {
        String[] elements = expression.split("\s");
        if (elements.length != 3) {
            System.out.println("Введено выражение, которое не соответствует требуемому формату. Просьба " +
                    "ввести корректное выражение");
            return;
        }

        try {
            int a = Integer.parseInt(elements[0]);
            char sign = elements[1].charAt(0);
            int b = Integer.parseInt(elements[2]);

            if (!(a > 0 && b > 0)) {
                throw new NumberFormatException();
            }

            int result = switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> Math.multiplyExact(a, b);
                case '/' -> Math.floorDiv(a, b);
                case '^' -> (int) Math.pow(a, b);
                default -> throw new IllegalStateException();
            };

            System.out.println(a + " " + sign + " " + b + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Операнды должны быть целыми положительными числами. Просьба ввести" +
                    " корректные значения");
        } catch (IllegalStateException e) {
            System.out.println("Введен неверный метематический оператор. Просьба ввести корректный оператор");
        }
    }
}
