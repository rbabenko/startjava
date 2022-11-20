package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Player {
    public static final int MAX_ATTEMPTS = 3;
    private String name;
    private int number;
    private int[] attempts;
    private int attemptNumber;

    public Player(String name) {
        this.name = name;
        attempts = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attemptNumber);
    }

    public void setAttempts(int number) throws InputMismatchException {
        if (number > 0 && number <= 100) {
            attempts[attemptNumber++] = number;
            this.number = number;
        } else {
            throw new InputMismatchException();
        }
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, attemptNumber, 0);
        attemptNumber = 0;
    }
}
