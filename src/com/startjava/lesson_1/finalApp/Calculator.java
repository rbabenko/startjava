package com.startjava.lesson_1.finalApp;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 16;
        char sign = '^';

        int result = 0;

        if (!(a > 0 && b > 0)) {
            System.out.println("Операнды должны являться целыми положительными числами");
            return;
        }

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            } 
        } else {
            System.out.printf("Введена неподдерживаемая арифметическая операция: %c\n", sign);
            return;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }   
}