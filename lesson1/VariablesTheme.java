public class VariablesTheme {
	public static void main(String[] args) {
		System.out.println("\n1. Создание переменных и вывод их значений на консоль");
		byte countHdd = 1;
		short countRam = 2;
		int countCoreCpu = 12;
		long sizeHdd = 1_048_576;
		float frequencyRam = 3.2f;
		double frequencyCpu = 3.7;
		char typeOS = 'w';
		boolean isNotebook = false;
		System.out.println("Количество жестких дисков: " + countHdd);
		System.out.println("Количество планок оперативной памяти: " + countRam);
		System.out.println("Количество ядер процессора: " + countCoreCpu);
		System.out.println("Размер жесткого диска в мегабайтах: " + sizeHdd);
		System.out.println("Частота оперативной памяти: " + frequencyRam);
		System.out.println("Частота процессора: " + frequencyCpu);
		System.out.println("Тип ОС (w - Windows, l - Linux, m - MacOS): " + typeOS);
		System.out.println("Это ноутбук? " + isNotebook);

		System.out.println("\n2. Расчет стоимости товара со скидкой");
		int sum = 100 + 200;
		double sumDiscount = sum * 0.11;
		double discountPrice = sum - sumDiscount;
		System.out.println("Сумма скидки: " + sumDiscount);
		System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

		System.out.println("\n3. Вывод на консоль слова JAVA");
		System.out.println("   J    a  v     v  a   ");
		System.out.println("   J   a a  v   v  a a  ");
		System.out.println("J  J  aaaaa  V V  aaaaa ");
		System.out.println(" JJ  a     a  V  a     a");

		System.out.println("\n4. Отображение min и max значений числовых типов данных");
		byte byteMax = Byte.MAX_VALUE;
		short shortMax = Short.MAX_VALUE;
		int intMax = Integer.MAX_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("первоначальное значение");
		System.out.println("byte: " + byteMax);
		System.out.println("short: " + shortMax);
		System.out.println("int: " + intMax);
		System.out.println("long: " + longMax);
		System.out.println("значение после инкремента");
		System.out.println("byte: " + (++byteMax));
		System.out.println("short: " + (++shortMax));
		System.out.println("int: " + (++intMax));
		System.out.println("long: " + (++longMax));
		System.out.println("значение после декремента");
		System.out.println("byte: " + (--byteMax));
		System.out.println("short: " + (--shortMax));
		System.out.println("int: " + (--intMax));
		System.out.println("long: " + (--longMax));

		System.out.println("\n5. Перестановка значений переменных");
		int num1 = 2;
		int num2 = 5;
		System.out.println("с помощью третьей переменной:");
		System.out.println("исходные значения переменных: " + num1 + ", " + num2);
		int temp = num2;
		num2 = num1;
		num1 = temp;
		System.out.println("новые значения переменных: " + num1 + ", " + num2);
		System.out.println("с помощью арифметических операций:");
		System.out.println("исходные значения переменных: " + num1 + ", " + num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("новые значения переменных: " + num1 + ", " + num2);
		System.out.println("с помощью побитовой операции ^:");
		System.out.println("исходные значения переменных: " + num1 + ", " + num2);
		num1 ^= num2;
		num2 ^= num1;
		num1 ^= num2;
		System.out.println("новые значения переменных: " + num1 + ", " + num2);

		System.out.println("\n6. Вывод символов и их кодов");
		char symbol1 = 35;
		char symbol2 = 38;
		char symbol3 = 64;
		char symbol4 = 94;
		char symbol5 = 95;
		System.out.println((int) symbol1 + " -> " + symbol1);
		System.out.println((int) symbol2 + " -> " + symbol2);
		System.out.println((int) symbol3 + " -> " + symbol3);
		System.out.println((int) symbol4 + " -> " + symbol4);
		System.out.println((int) symbol5 + " -> " + symbol5);

		System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
		int number = 123;
		System.out.println("Число N содержит: ");
		System.out.println((number / 100) % 100 + " сотен");
		System.out.println((number / 10) % 10 + " десятков");
		System.out.println(number % 10 + " единиц");

		System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
		char slash = '/';
		char backslash = '\\';
		char space = ' ';
		char underscore = '_';
		char openBrace = '(';
		char closeBrace = ')';

		System.out.println("" + space + space + space + space + slash + backslash + space + space + space + space);
		System.out.println("" + space + space + space + slash + space + space + backslash + space + space + space);
		System.out.println("" + space + space + slash + underscore + openBrace + space + closeBrace + backslash + space + space);
		System.out.println("" + space + slash + space + space + space + space + space + space + backslash + space);
		System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

		System.out.println("\n9. Произведение и сумма цифр числа");
		number = 345;
		int hundreds = (number / 100) % 100;
		int dozens = (number / 10) % 10;
		int ones = number % 10;
		int mult = hundreds * dozens * ones;
		sum = hundreds + dozens + ones;
		System.out.println("сумма цифр числа N = " + sum);
		System.out.println("произведение цифр числа N = " + mult);

		System.out.println("\n10. Преобразование секунд");
		int totalSeconds = 86399;
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600) / 60;
		int seconds = totalSeconds % 60;
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}