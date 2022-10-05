import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Для использвания калькулятора введите необходимое выражение. Для выхода введите \"exit\".");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String inputStr = scanner.nextLine();
            if (inputStr.equalsIgnoreCase("exit")) {
                break;
            }
            
            String[] parseStr = inputStr.split(" ");
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
                    printResult(a, b, operation, a + b);
                } else if (operation.equals("-")) {
                    printResult(a, b, operation, a - b);
                } else if (operation.equals("*")) {
                    printResult(a, b, operation, a * b);
                } else if (operation.equals("/")) {
                    printResult(a, b, operation, a / b);
                } else if (operation.equals("^")) {
                    printResult(a, b, operation, pow(a, b));
                } else if (operation.equals("%")) {
                    printResult(a, b, operation, a % b);
                } else {
                    System.out.printf("Ошибка ввода данных: %s. Введена неподдерживаемая арифметическая операция\n", inputStr);
                    continue;
                }
            } catch (NumberFormatException e) {
                numberErrorDescription(inputStr);
                continue;
            }
        }
        scanner.close();
    }

    private static int pow(int number, int degree) {
        int result = 1;

        while (degree > 0) {
            result *= number;
            --degree;
        }
        return result;
    }

    private static void numberErrorDescription(String inputStr) {
        System.out.printf("Ошибка ввода данных: %s. Введенные операнды должны соответствовать целам положительным числам\n", inputStr);
    }

    private static void printResult(int a, int b, String operator, int result) {
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }   
}