package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;

    private Player[] players;

    public GuessNumber(Player... players) {
        hiddenNumber = 1 + (int) (Math.random() * 100);
        this.players = players;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        clearPreviousAttemptsPlayer(players);
        drawStraws();
        Player currentPlayer = players[0];
        while (true) {
            if (isFullAttemptsPlayers()) {
                System.out.printf("Игра закончена. Все игроки использовали все доступные %d попыток(ки)\n",
                        Player.MAX_ATTEMPTS);
                break;
            }
            System.out.println("----------------------------------------");
            System.out.printf("%d-й ход игрока: %s\n", currentPlayer.getAttemptNumber() + 1, currentPlayer.getName());
            if (currentPlayer.getAttemptNumber() >= Player.MAX_ATTEMPTS) {
                System.out.printf("У %s закончились попытки\n", currentPlayer.getName());
                currentPlayer = getNextPlayer(currentPlayer);
                continue;
            }
            do {
                try {
                    System.out.print("Введите число: ");
                    int inputNumber = scanner.nextInt();
                    currentPlayer.setAttempts(inputNumber);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введенное значение должно быть целочисленного типа в интервале (0, 100]");
                    scanner.nextLine();
                }
            } while (true);

            if (compareNumbers(currentPlayer)) {
                break;
            }

            currentPlayer = getNextPlayer(currentPlayer);
        }
    }

    private void clearPreviousAttemptsPlayer(Player... players) {
        for (Player player : players) {
            player.clearAttempts();
        }
    }

    private void drawStraws() {

    }

    private boolean isFullAttemptsPlayers() {
        for (Player player : players) {
            if (player.getAttemptNumber() < Player.MAX_ATTEMPTS) {
                return false;
            }
        }
        return true;
    }

    private Player getNextPlayer(Player previousPlayer) {
        Player player = players[0];
        for (int i = 0; i < players.length; i++) {
            if (players[i] == previousPlayer) {
                if ((i + 1) < players.length) {
                    player = players[i + 1];
                    break;
                }
            }
        }
        return player;
    }

    private boolean compareNumbers(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber == hiddenNumber) {
            System.out.printf("Игрок %s угадал число %d с %d-ой попытки\n", player.getName(), hiddenNumber, player.getAttemptNumber());
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер\n", playerNumber,
                playerNumber < hiddenNumber ? "меньше" : "больше");
        return false;
    }
}
