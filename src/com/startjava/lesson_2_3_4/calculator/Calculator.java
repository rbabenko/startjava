package com.startjava.lesson_2_3_4.calculator;

import java.util.NoSuchElementException;

public class Calculator {
    public static int calculate(String expression) {
        String[] elements = expression.split("\s");
        if (elements.length != 3) {
            throw new NoSuchElementException();
        }

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

        return result;
    }
}
