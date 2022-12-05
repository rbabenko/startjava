package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.startjava.lesson_2_3_4.guess.GuessNumberTest.*;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUND = 3;
    public final static int UPPER_LIMIT = 100;
    public final static int LOWER_LIMIT = 1;
    private int hiddenNumber;
    private Player[] players;
    private Player winPlayer;

    public GuessNumber(Player... players) {
        hiddenNumber = generateNumber();
        this.players = players;
    }

    public Player getWinPlayer() {
        return winPlayer;
    }

    public void start() {
        int countRound = 0;
        while (countRound < MAX_ROUND) {
            clear();
            countRound++;
            System.out.println("----------------------------------------");
            System.out.printf("%d-й раунд\n", countRound);
            playRound();
            System.out.println("----------------------------------------");
            System.out.printf("Итоги %d-го раунда\n", countRound);
            for (Player player : players) {
                System.out.printf("Попытки игрока %s: ", player.getName());
                printNumberArray(player.getEnteredNumbers());
            }
        }
    }

    private void playRound() {
        Player currentPlayer = drawStrawsPlayers();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (isFullAttemptsPlayers()) {
                System.out.printf("Раунд закончен. Все игроки использовали все доступные %d попыток(ки)\n",
                        MAX_ATTEMPTS);
                break;
            }
            System.out.println("----------------------------------------");
            System.out.printf("%d-й ход игрока: %s\n", currentPlayer.getAttempts() + 1, currentPlayer.getName());
            if (currentPlayer.getAttempts() >= MAX_ATTEMPTS) {
                System.out.printf("У %s закончились попытки\n", currentPlayer.getName());
                currentPlayer = getNextPlayer(currentPlayer);
                continue;
            }
            do {
                try {
                    System.out.print("Введите число: ");
                    int inputNumber = scanner.nextInt();
                    currentPlayer.addNumber(inputNumber);
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

    private int generateNumber() {
        return LOWER_LIMIT + (int) (Math.random() * UPPER_LIMIT);
    }

    private void clear() {
        hiddenNumber = generateNumber();
        for (Player player : players) {
            player.clear();
        }
    }

    private Player drawStrawsPlayers() {
        int len = players.length;
        do {
            int i = (int) (Math.random() * len);
            Player temp = players[--len];
            players[len] = players[i];
            players[i] = temp;
        } while (len > 0);
        return players[0];
    }

    private boolean isFullAttemptsPlayers() {
        for (Player player : players) {
            if (player.getAttempts() < MAX_ATTEMPTS) {
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
            System.out.printf("Игрок %s угадал число %d с %d-ой попытки\n", player.getName(), hiddenNumber, player.getAttempts());
            player.setNumberWins();
            if (winPlayer == null || player.getNumberWins() > winPlayer.getNumberWins()) {
                winPlayer = player;
            }
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер\n", playerNumber,
                playerNumber < hiddenNumber ? "меньше" : "больше");
        return false;
    }

    private static void printNumberArray(int... array) {
        for (int number : array) {
            System.out.printf("%3d", number);
        }
        System.out.println();
    }
}
