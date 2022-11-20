package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public Calculator(int a, int b, char sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public void calculate() throws Exception {
        int result = switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '^' -> (int) Math.pow(a, b);
            default -> throw new Exception();
        };
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
