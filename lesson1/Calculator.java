public class Calculator {
    public static void main(String[] args) {
        int operand1 = 2;
        int operand2 = 16;
        char operator = '^';

        int result = 0;

        if (!(operand1 > 0 && operand2 > 0)) {
            System.out.println("Операнды должны являться целыми положительными числами");
            return;
        }

        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            result = operand1 / operand2;
        } else if (operator == '^') {
            result = 1;
            int degree = operand2;
            while (degree > 0) {
                result *= operand1;
                --degree;
            }
        } else {
            System.out.printf("Введена неподдерживаемая арифметическая операция: %c\n", operator);
            return;
        }

        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }   
}