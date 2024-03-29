package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public final static int MAX_PLAYERS = 3;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");
        System.out.printf("У каждого игрока по %d попыток\n", GuessNumber.MAX_ATTEMPTS);
        System.out.println("----------------------------------------");

        Player[] players = createPlayers();

        do {          
            GuessNumber game = new GuessNumber(players);
            game.start();
        } while (isNext());

        scanner.close();
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[MAX_PLAYERS];
        for (int i = 0; i < MAX_PLAYERS; i++) {
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }

    private static boolean isNext() {
        String option;
        do {
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            option = scanner.nextLine();
        } while (!option.equals("yes") && !option.equals("no"));
        return option.equals("yes");
    }
}
