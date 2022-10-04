import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String inputStr = scanner.nextLine();
            inputStr.replaceAll("\\s+", "");
            String[] parseStr = inputStr.split("");
            if (parseStr.length != 3) {
                System.out.printf("Ошибка ввода данных: %s. Введенная строка должна соответсвовать формату \"a + b\". Например, \"1 + 2\"\n", inputStr);
                continue;
            }
            try {
                final String operation = parseStr[1];
                final int a = Integer.parseInt(parseStr[0]);
                final int b = Integer.parseInt(parseStr[2]);
                if (!(a > 0 && b > 0)) {
                    numberErrorDescription(inputStr);
                    continue;
                }

                if (operation.equals("+")) {

                } else if (operation.equals("-")) {

                } else if (operation.equals("*")) {

                } else if (operation.equals("/")) {

                } else if (operation.equals("^")) {

                } else if (operation.equals("%")) {
                    
                }

            } catch (NumberFormatException e) {
                numberErrorDescription(inputStr);
                continue;
            }
        }
        scanner.close();
    }

    private static long pow(int number, int degree) {
        long result = 1;

        while (degree > 0) {
            result *= number;
            --degree;
        }
        return result;
    }

    private static void numberErrorDescription(String inputStr) {
        System.out.printf("Ошибка ввода данных: %s. Введенные операнды должны соответствовать целам положительным числам\n", inputStr);
    }
}