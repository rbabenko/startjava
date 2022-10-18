public class MyFirstGame {
    public static void main(String[] args) {
        final int startRange = 0;
        final int endRange = 100;
        int copyStartRange = startRange;
        int copyEndRange = endRange;
        int inputNumber = 58;
        int hiddenNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Игра \"Угадай число\"\n");

        while (inputNumber != hiddenNumber) {
            if (inputNumber < hiddenNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", inputNumber);
                copyStartRange = inputNumber;
                inputNumber = (copyEndRange - inputNumber) / 2 + inputNumber;
            } else if (inputNumber > hiddenNumber) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", inputNumber);
                copyEndRange = inputNumber;
                inputNumber = (inputNumber - copyStartRange) / 2;
            }
        }
        System.out.printf("Вы победили!. Загаданное число: %d\nw", inputNumber);
    }
}
