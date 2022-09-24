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
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", сумма нечетных чисел = " + sumOdd);

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
        System.out.print("Исходное число в обратном порядке: ");
        while (number >= 1) {
            sum += number % 10;
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);
        
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

        System.out.println("\n5. Проверка количества единиц на четность");
        number = 3141591;
        int source = number;
        int countOne = 0;
        while (number > 0) {
            if (number % 10 == 1) {
                countOne++;
            }
            number /= 10;
        }
        if (countOne % 2 == 0) {
            System.out.printf("Число %d содержит %s количество единиц\n", source, "четное");
        } else {
            System.out.printf("Число %d содержит %s количество единиц\n", source, "нечетное");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        char symbol = '*';
        System.out.println("прямоугольник:");
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println("прямоугольный треугольник:");
        symbol = '#';
        int row = 5;
        while (row > 0) {
            int column = row;
            while (column > 0) {
                System.out.print(symbol);
                --column;
            }
            System.out.println();
            --row;
        }
        System.out.println("треугольник:");
        symbol = '$';
        row = 0;
        int columnLimit = 0;
        do {
            j = 0;
            columnLimit = row < 3 ? ++columnLimit : --columnLimit;
            do {
                System.out.print(symbol);
                j++;
            } while (j < columnLimit);
            System.out.println();
            ++row;
        } while (row < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%6s %6s\n", "Dec", "Char");
        //символы, идущие до цифр
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%6d %6s\n", i, (char) i);
            }
        }
        //маленькие английские коды
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%6d %6s\n", i, (char) i);
            }
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        int tempNumber = number;
        int reverseNumber = 0;

        while (tempNumber > 0) {
            int value = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + value;
            tempNumber /= 10;
        }

        if (reverseNumber == number) {
            System.out.printf("число %d является палиндромом\n", number);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 123042;
        tempNumber = number;
        String partNumber = "";
        int partSum = 0;
        int counter = 1;
        int previousPartSum = 0;
        boolean isLuckyNumber = false;

        do {
            int value = tempNumber % 10;
            partSum += value;
            partNumber = value + partNumber;

            if (counter > 0 && counter % 3 == 0) {
                System.out.printf("Сумма цифр %s = %d\n", partNumber, partSum);
                isLuckyNumber = partSum == previousPartSum;
                previousPartSum = partSum;
                partNumber = "";
                partSum = 0;
            }
            tempNumber /= 10;
            counter++;
        } while (tempNumber > 0);
        if (isLuckyNumber)  {
            System.out.printf("Число %6d является счастливым", number);
        } else {
            System.out.printf("Число %6d не является счастливым", number);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("ТАБЛИЦА ПИФАГОРА");
    }
 }