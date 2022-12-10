package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Player {
    private String name;
    private int[] enteredNumbers;
    private int attempts;
    private int numberWins;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[GuessNumber.MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return enteredNumbers[attempts - 1];
    }

    public int getAttempts() {
        return attempts;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempts);
    }

    public void addNumber(int number) {
        if (number > 0 && number <= 100) {
            enteredNumbers[attempts++] = number;
        } else {
            throw new InputMismatchException();
        }
    }

    public int getNumberWins() {
        return numberWins;
    }

    public void incNumberWins() {
        numberWins++;
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0, attempts, 0);
        attempts = 0;
    }
}
