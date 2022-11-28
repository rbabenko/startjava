package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public final static int MAX_PLAYERS = 3;
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUND = 3;
    public final static int UPPER_LIMIT = 100;
    public final static int LOWER_LIMIT = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра \"Угадай число\"");
        System.out.printf("У каждого игрока по %d попыток\n", MAX_ATTEMPTS);
        System.out.println("----------------------------------------");

        Player[] players = new Player[MAX_PLAYERS];

        for (int i = 0; i < MAX_PLAYERS; i++) {
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }

        do {          
            GuessNumber game = new GuessNumber(players);
            int countRound = 0;
            while (countRound < MAX_ROUND) {
                countRound++;
                System.out.println("----------------------------------------");
                System.out.printf("%d-й раунд\n", countRound);
                game.start();
                System.out.println("----------------------------------------");
                System.out.printf("Итоги %d-го раунда\n", countRound);
                for (Player player : players) {
                    System.out.printf("Попытки игрока %s: ", player.getName());
                    printNumberArray(player.getAttempts());
                }
            }
            System.out.println("----------------------------------------");
            System.out.printf("Победитель после %d раундов: %s с количеством побед равным %d\n",
                    MAX_ROUND, game.getWinPlayer().getName(), game.getWinPlayer().getWinRounds());

            if (!continueGame()) {
                break;
            }
        } while (true);

        scanner.close();
    }

    private static void printNumberArray(int... array) {
        for (int number : array) {
            System.out.printf("%3d", number);
        }
        System.out.println();
    }

    private static boolean continueGame() {
        Scanner scanner = new Scanner(System.in);
        String continuation;
        do {
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            continuation = scanner.nextLine();
        } while (!continuation.equals("yes") && !continuation.equals("no"));
        return continuation.equals("yes");
    }
}
