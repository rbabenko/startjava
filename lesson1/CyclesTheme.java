public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", сумма нечетных чисел = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = c;
        int min = c;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        }
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);
        
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2, count++) {
            if (count != 0 && count % 5 == 0) {
                count = 0;
                System.out.println();
            }
            System.out.printf("%2d ", i);
        }
        if (count != 0) {
            while (count < 5) {
                System.out.printf("%2d ", 0);
                count++;
            }
        }
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        number = 3141591;
        int copyNumber = number;
        int countOnes = 0;
        while (number > 0) {
            if (number % 10 == 1) {
                countOnes++;
            }
            number /= 10;
        }
        System.out.printf("Число %d содержит %s количество единиц\n", copyNumber, countOnes % 2 == 0 ? "четное" : "нечетное");

        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("прямоугольник:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("прямоугольный треугольник:");
        int row = 5;
        while (row > 0) {
            int column = row;
            while (column > 0) {
                System.out.print('#');
                --column;
            }
            System.out.println();
            --row;
        }
        System.out.println();
        System.out.println("треугольник:");
        row = 0;
        int columnLimit = 0;
        do {
            count = 0;
            columnLimit = row < 3 ? ++columnLimit : --columnLimit;
            do {
                System.out.print('$');
                count++;
            } while (count < columnLimit);
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
        copyNumber = number;
        int reverseNumber = 0;

        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            copyNumber /= 10;
        }

        if (reverseNumber == number) {
            System.out.printf("Число %d является палиндромом\n", number);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 123042;
        copyNumber = number;
        String partNumber = "";
        int partSum = 0;
        counter = 1;
        int previousPartSum = 0;
        boolean isLuckyNumber = false;

        do {
            int digit = copyNumber % 10;
            partSum += digit;
            partNumber = digit + partNumber;

            if (counter > 0 && counter % 3 == 0) {
                System.out.printf("Сумма цифр %s = %d\n", partNumber, partSum);
                isLuckyNumber = partSum == previousPartSum;
                previousPartSum = partSum;
                partNumber = "";
                partSum = 0;
            }
            copyNumber /= 10;
            counter++;
        } while (copyNumber > 0);
        if (isLuckyNumber)  {
            System.out.printf("Число %6d является счастливым\n", number);
        } else {
            System.out.printf("Число %6d не является счастливым\n", number);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%10s ","ТАБЛИЦА");
        System.out.printf("%11s","ПИФАГОРА");
        for (int i = 1; i < 10; i++) {
            System.out.printf("\n%-2s|", i != 1 ? i : "");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i*j);
            }
            if (i == 1) {
                System.out.println();
                for (int j = 1; j < 10; j++) {
                    System.out.printf("%3s", "---");
                }
            }
        }
    }
 }