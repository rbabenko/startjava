public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int x = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (x == 0) {
                x++;
                continue;
            }
            if (x % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
            x++;
        } while (x <= 21);
        System.out.println("Сумма четных чисел = " + sumEven + ", сумма нечетных чисел = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a >= b && a >= c ? a : b >= a && b >= c ? b : c;
        int min = a <= b && a <= c ? a : b <= a && b <= c ? b : c;
        
        for (int i = min + 1; i < max; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number >= 1) {
            sum += number % 10;
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println("\n" + sum);
        
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int j = 0;
        for (int i = 1; i < 24; i += 2, j++) {
            if (j != 0 && j % 5 == 0) {
                j = 0;
                System.out.printf("\n");
            }
            System.out.printf("%2d ", i);
        }
        if (j != 0) {
            while (j < 5) {
                System.out.printf("%2d ", 0);
                j++;
            }
        }
    }
 }