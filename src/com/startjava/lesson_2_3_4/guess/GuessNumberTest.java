package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_PLAYERS = 3;

        System.out.println("Игра \"Угадай число\"");
        System.out.printf("У каждого игрока по %d попыток\n", Player.MAX_ATTEMPTS);

        Player[] players = new Player[MAX_PLAYERS];

        for (int i = 0; i < MAX_PLAYERS; i++) {
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }

        do {          
            GuessNumber game = new GuessNumber(players);
            game.start();
            for (Player player : players) {
                System.out.printf("Попытки игрока %s: ", player.getName());
                printNumberArray(player.getAttempts());
                System.out.println();
            }

            System.out.print("\nХотите продолжить игру? [yes]: ");
            String continuation = scanner.nextLine();
            if (continuation.equals("yes")) {
                continue;
            }
            break;
        } while (true);

        scanner.close();
    }

    private static void printNumberArray(int... array) {
        for (int number : array) {
            System.out.printf("%3d", number);
        }
    }
}
