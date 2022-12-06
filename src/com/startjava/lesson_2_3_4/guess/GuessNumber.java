package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUNDS = 3;
    public final static int START_RANGE = 1;
    public final static int END_RANGE = 100;
    private int hiddenNumber;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        for (int i = 1; i <= GuessNumber.MAX_ROUNDS; i++) {
            System.out.println("----------------------------------------");
            System.out.printf("%d-й раунд\n", i);
            playRound();
            System.out.println("----------------------------------------");
            System.out.printf("Итоги %d-го раунда\n", i);
            printPlayerAttempts();
            printGameWinner();
        }
    }

    private void playRound() {
        Player currentPlayer = castLots();
        Scanner scanner = new Scanner(System.in);

        init();

        while (true) {
            if (hasAttempts()) {
                System.out.printf("Раунд закончен. Все игроки использовали все доступные %d попыток(ки)\n",
                        GuessNumber.MAX_ATTEMPTS);
                break;
            }
            System.out.println("----------------------------------------");
            System.out.printf("%d-й ход игрока: %s\n", currentPlayer.getAttempts() + 1, currentPlayer.getName());
            if (currentPlayer.getAttempts() >= GuessNumber.MAX_ATTEMPTS) {
                System.out.printf("У %s закончились попытки\n", currentPlayer.getName());
                currentPlayer = changePlayer(currentPlayer);
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

            currentPlayer = changePlayer(currentPlayer);
        }
    }

    private void init() {
        hiddenNumber = generateHiddenNumber();
        for (Player player : players) {
            player.clear();
        }
    }

    private int generateHiddenNumber() {
        return GuessNumber.START_RANGE + (int) (Math.random() * GuessNumber.END_RANGE);
    }

    private Player castLots() {
        for (int len = players.length; len > 0; len--) {
            int i = (int) (Math.random() * len);
            Player temp = players[len - 1];
            players[len - 1] = players[i];
            players[i] = temp;
        }
        return players[0];
    }

    private boolean hasAttempts() {
        for (Player player : players) {
            if (player.getAttempts() < GuessNumber.MAX_ATTEMPTS) {
                return false;
            }
        }
        return true;
    }

    private Player changePlayer(Player previousPlayer) {
        Player player = players[0];
        for (int i = 0; i < players.length; i++) {
            if (players[i] == previousPlayer && (i + 1) < players.length) {
                player = players[i + 1];
                break;
            }
        }
        return player;
    }

    private boolean compareNumbers(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber == hiddenNumber) {
            System.out.printf("Игрок %s угадал число %d с %d-ой попытки\n", player.getName(), hiddenNumber,
                    player.getAttempts());
            player.incNumberWins();
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер\n", playerNumber,
                playerNumber < hiddenNumber ? "меньше" : "больше");
        return false;
    }

    private void printPlayerAttempts() {
        for (Player player : players) {
            System.out.printf("Попытки игрока %s: ", player.getName());
            printPlayerAttempts(player.getEnteredNumbers());
        }
    }

    private void printPlayerAttempts(int[] array) {
        for (int number : array) {
            System.out.printf("%4d", number);
        }
        System.out.println();
    }

    private void printGameWinner() {
        System.out.println("----------------------------------------");
        Player winPlayer = players[0];
        for (Player player : players) {
            if (player.getNumberWins() > winPlayer.getNumberWins()) {
                winPlayer = player;
            }
        }
        if (winPlayer.getNumberWins() == 0) {
            System.out.printf("Победитель после %d раундов не найден", GuessNumber.MAX_ROUNDS);
        } else {
            System.out.printf("Победитель после %d раунда(ов): %s с количеством побед равным %d\n",
                    GuessNumber.MAX_ROUNDS, winPlayer.getName(), winPlayer.getNumberWins());
        }
    }
}
