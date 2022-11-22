package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;

import static com.startjava.lesson_2_3_4.guess.GuessNumberTest.MAX_ATTEMPTS;

public class Player {
    private String name;
    private int number;
    private int[] attempts;
    private int numberUsedAttempts;
    private int winRounds;

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

    public int getNumberUsedAttempts() {
        return numberUsedAttempts;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberUsedAttempts);
    }

    public void setAttempts(int number) throws InputMismatchException {
        if (number > 0 && number <= 100) {
            attempts[numberUsedAttempts++] = number;
            this.number = number;
        } else {
            throw new InputMismatchException();
        }
    }

    public int getWinRounds() {
        return winRounds;
    }

    public void setWinRounds() {
        winRounds++;
    }

    public void clear() {
        Arrays.fill(attempts, 0, numberUsedAttempts, 0);
        numberUsedAttempts = 0;
    }
}
