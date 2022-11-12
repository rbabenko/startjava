package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private int result;

    public Calculator(int a, int b, char sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getResult() {
        return result;
    }
    
    public void calculate() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = pow(a, b);
                break;
        }
    }

    private int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
