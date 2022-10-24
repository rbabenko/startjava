package lesson2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuation;

        System.out.println("Игра \"Угадай число\"\n");
        
        do {
            System.out.print("Введите имя 1-го игрока: ");
            Player player1 = new Player(scanner.nextLine());

            System.out.print("Введите имя 2-го игрока: ");
            Player player2 = new Player(scanner.nextLine());
            
            GuessNumber game = new GuessNumber(player1, player2);

            game.execute();

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                continuation = scanner.nextLine();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
        } while (continuation.equals("yes"));

        scanner.close();
    }
}
