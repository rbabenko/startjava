public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 24;
        if (age > 20) {
            System.out.println("зрелый");
        } else {
            System.out.println("молодой");
        }
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("женский пол");
        } else {
            System.out.println("мужской пол");
        }
        double height = 1.76;
        if (height < 1.80) {
            System.out.println("невысокий");
        } else {
            System.out.println("высокий");
        }
        char firstLetterFirstName = "Рома".charAt(0);
        if (firstLetterFirstName == 'M') {
            System.out.println("Ваше имя прекрасно");
        } else if (firstLetterFirstName == 'I') {
            System.out.println("Ваше имя чуть менее прекрасно");
        } else {
            System.out.println("Ваше имя обычное");
        }

        System.out.println("\n2. Поиск max и min числа");
        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println("max = " + a + ", min = " + b);
        } else if (b > a) {
            System.out.println("max = " + b + ", min = " + a);
        } else {
            System.out.println("a равно b");
        }

        System.out.println("\n3. Работа с числом");
        int variable = 16;
        if (variable != 0) {
            if (variable % 2 == 0) {
                System.out.println("Число является четным");    
            } else {
                System.out.println("Число является нечетным");
            }
            if (variable > 0) {
                System.out.println("Число является положительным");
            } else {
                System.out.println("Число является отрицательным");
            }
        } else {
            System.out.println("Число является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int var1 = 100;
        int var2 = 500;
        System.out.println("исходные числа: " + var1 + ", " + var2);
        int digitNumber = 0;
        if (var1 % 10 == var2 % 10) {
            System.out.println("Одинаковые цифры: " + var1 % 10);
            System.out.println("Номер разряда: " + digitNumber);
        }
        var1 /= 10;
        var2 /= 10;
        digitNumber++;
        if (var1 % 10 == var2 % 10) {
            System.out.println("Одинаковые цифры: " + var1 % 10);
            System.out.println("Номер разряда: " + digitNumber);
        }
        var1 /= 10;
        var2 /= 10;
        digitNumber++;
        if (var1 % 10 == var2 % 10) {
            System.out.println("Одинаковые цифры: " + var1 % 10);
            System.out.println("Номер разряда: " + digitNumber);
        }
        var1 /= 10;
        var2 /= 10;
        digitNumber++;

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char character = '\u0057';
        if (character >= '\u0061' && character <= '\u007A') {
            System.out.println("маленькая буква");
        } else if (character >= '\u0041' && character <= '\u005A') {
            System.out.println("большая буква");
        } else if (character >= '\u0030' && character <= '\u0039') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000; 
        int percent = 0;
        if (depositAmount < 100_000) {
            percent = 5;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            percent = 7;
        } else if (depositAmount > 300_000) {
            percent = 10;
        }
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Начисленный %: " + percent);
        System.out.println("Итоговая сумма с %: " + (depositAmount + ((depositAmount * percent) / 100)));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyScore = 2;
        int programmingScore = 2;
        if (historyPercent <= 60) {
            historyScore = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
        } else if (historyPercent > 91 && historyPercent <= 100) {
            historyScore = 5;
        }
        System.out.println("история - " + historyScore);
        if (programmingPercent <= 60) {
            programmingScore = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
        } else if (programmingPercent > 91 && programmingPercent <= 100) {
            programmingScore = 5;
        }
        System.out.println("программирование - " + programmingScore);
        System.out.println("средний балл оценок по предметам - " + (historyScore + programmingScore) / 2);
        System.out.println("средний % по предматем - " + (historyPercent + programmingPercent) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rentCost = 5_000;
        int saleCost = 13_000;
        int productionCost = 9_000;
        int profit = (saleCost - rentCost - productionCost) * 12;
        if (profit > 0) {
            System.out.println("прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("прибыль за год: " + profit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        final int withdraw = 567;
        final int tenDollarBanknoteRemain = 5;
        int oneHundredDollarBanknote = withdraw / 100;
        int remain = (withdraw - oneHundredDollarBanknote * 100);
        int tenDollarBanknote = remain / 10 > tenDollarBanknoteRemain ? tenDollarBanknoteRemain : remain / 10;
        int oneDollarBanknote = withdraw - 100 * oneHundredDollarBanknote - 10 * tenDollarBanknote;
        System.out.println("100 долларовых банкнот: " + oneHundredDollarBanknote);
        System.out.println("10 долларовых банкнот: " + tenDollarBanknote);
        System.out.println("1 долларовых банкнот: " + oneDollarBanknote);
        System.out.println("Посчитанная исходная сумма: " + (oneHundredDollarBanknote * 100 + tenDollarBanknote * 10 + oneDollarBanknote));
    }
}
