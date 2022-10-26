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
        try (Scanner scanner = new Scanner(System.in)) {
            Player currentPlayer = player1;
            while (true) {
                System.out.println("----------------------------------------");
                System.out.printf("Ход игрока: %s\n", currentPlayer.getName());
                System.out.print("Введите число: ");
                int number = scanner.nextInt();
                currentPlayer.setNumber(number);
                
                if (compareNumbers(currentPlayer.getNumber())) {
                    break;
                }

                currentPlayer = currentPlayer == player1 ? player2 : player1;
            }
        }
    }

    private boolean compareNumbers(int assumedNumber) {
        if (assumedNumber < hiddenNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", assumedNumber);
            return false;
        } else if (assumedNumber > hiddenNumber) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", assumedNumber);
            return false;
        }
        System.out.printf("Игрок победил! Загаданное число: %d\n", hiddenNumber);
        return true;
    }
}
