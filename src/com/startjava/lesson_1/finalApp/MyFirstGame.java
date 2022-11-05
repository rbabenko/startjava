package com.startjava.lesson_1.finalApp;

public class MyFirstGame {
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;
        int inputNumber = 58;
        int hiddenNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Игра \"Угадай число\"\n");

        while (inputNumber != hiddenNumber) {
            if (inputNumber < hiddenNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", inputNumber);
                startRange = inputNumber;
                inputNumber = (endRange - inputNumber) / 2 + inputNumber;
            } else if (inputNumber > hiddenNumber) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", inputNumber);
                endRange = inputNumber;
                inputNumber = (inputNumber - startRange) / 2;
            }
        }
        System.out.printf("Вы победили! Загаданное число: %d\nw", inputNumber);
    }
}
