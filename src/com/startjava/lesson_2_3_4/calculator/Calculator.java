package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(int a, int b, char sign) throws Exception {
        int result = switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '^' -> (int) Math.pow(a, b);
            default -> throw new Exception();
        };
        return result;
    }
}
