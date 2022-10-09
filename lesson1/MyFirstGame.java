import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        final int lower = 0;
        final int upper = 100;
        int inputNumber = -1;
        int hiddenNumber = lower + (int) (Math.random() * (upper - lower));
        System.out.println("Игра \"Угадай число\"");
        Scanner scanner = new Scanner(System.in);

        do {
            inputNumber = scanner.nextInt();
            if (!(inputNumber > lower && inputNumber <= upper)) {
                System.out.printf("Введенное число %d должно находиться в полуинтервале (%d, %d]\n", inputNumber, lower, upper);
                continue;
            }

            if (hiddenNumber == inputNumber) {
                System.out.println("Вы победили!");
                break;
            }

            if (inputNumber < hiddenNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", inputNumber);
            }
            if (inputNumber > hiddenNumber) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", inputNumber);
            }
        } while (scanner.hasNextInt());

        scanner.close();
    }
}
