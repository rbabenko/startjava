package lesson2;

public class GuessNumber {
    private int hiddenNumber;

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        hiddenNumber = 1 + (int) (Math.random() * 100);

        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean execute() {
        Player currentPlayer = player1;
        while (true) {
            System.out.printf("Ход игрока: %s\n", currentPlayer.getName());

            String status = equalNumber(currentPlayer.getNumber());
            
            if (status.equals("equal")) {
                break;
            }

            currentPlayer.calculate(status);

            currentPlayer = currentPlayer.equals(player1) ? player2 : player1;
        }

        return true;
    }

    private String equalNumber(int assumedNumber) {
        if (assumedNumber < hiddenNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", assumedNumber);
            return "less";
        } else if (assumedNumber > hiddenNumber) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", assumedNumber);
            return "more";
        } else {
            System.out.printf("Игрок победил! Загаданное число: %d\n", hiddenNumber);
            return "equal";
        }
    }
}
