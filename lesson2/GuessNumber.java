package lesson2;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        hiddenNumber = 1 + (int) (Math.random() * 100);

        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        while (true) {
            System.out.println("----------------------------------------");
            System.out.printf("Ход игрока: %s\n", currentPlayer.getName());
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            currentPlayer.setNumber(number);
            
            if (compareNumbers(currentPlayer)) {
                break;
            }

            currentPlayer = currentPlayer == player1 ? player2 : player1;
        }
    }

    private boolean compareNumbers(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber == hiddenNumber) {
            System.out.printf("Игрок %s победил! Загаданное число: %d\n", player.getName(), hiddenNumber);
            return true;
        } else if (playerNumber < hiddenNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNumber);
        } else if (playerNumber > hiddenNumber) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", playerNumber);
        }
        return false;
    }
}
