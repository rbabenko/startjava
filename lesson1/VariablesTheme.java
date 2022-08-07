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
		System.out.println("Сумма скидки: " + (sum * 0.11));
		System.out.println("общую стоимость товаров со скидкой: " + (sum * (1 - 0.11)));

		System.out.println("\n3. Вывод на консоль слова JAVA");
		System.out.println("   J    a  v     v  a   ");
		System.out.println("   J   a a  v   v  a a  ");
		System.out.println("J  J  aaaaa  V V  aaaaa ");
		System.out.println(" JJ  a     a  V  a     a");

		System.out.println("\n4. Отображение min и max значений числовых типов данных");
		byte byteVariable = Byte.MAX_VALUE;
		short shortVariable = Short.MAX_VALUE;
		int intVariable = Integer.MAX_VALUE;
		long longVariable = Long.MAX_VALUE;
		System.out.println("первоначальное значение");
		System.out.println("byte: " + byteVariable);
		System.out.println("short: " + shortVariable);
		System.out.println("int: " + intVariable);
		System.out.println("long: " + longVariable);
		System.out.println("значение после инкремента");
		System.out.println("byte: " + (++byteVariable));
		System.out.println("short: " + (++shortVariable));
		System.out.println("int: " + (++intVariable));
		System.out.println("long: " + (++longVariable));
		System.out.println("значение после декремента");
		System.out.println("byte: " + (--byteVariable));
		System.out.println("short: " + (--shortVariable));
		System.out.println("int: " + (--intVariable));
		System.out.println("long: " + (--longVariable));

		System.out.println("\n5. Перестановка значений переменных");
		int firstVar = 1;
		int secondVar = 2;
		System.out.println("с помощью третьей переменной:");
		System.out.println("исходные значения переменных: " + firstVar + ", " + secondVar);
		int temp = secondVar;
		secondVar = firstVar;
		firstVar = temp;
		System.out.println("новые значения переменных: " + firstVar + ", " + secondVar);
		System.out.println("с помощью арифметических операций:");
		System.out.println("исходные значения переменных:" + firstVar + ", " + secondVar);
		firstVar += -1;
		secondVar += 1;
		System.out.println("новые значения переменных: " + firstVar + ", " + secondVar);
		System.out.println("с помощью побитовой операции ^:");
		System.out.println("исходные значения переменных: " + firstVar + ", " + secondVar);
		firstVar ^= 3;
		secondVar ^= 3;
		System.out.println("новые значения переменных: " + firstVar + ", " + secondVar);

		System.out.println("\n6. Вывод символов и их кодов");
		char character1 = 35;
		char character2 = 38;
		char character3 = 64;
		char character4 = 94;
		char character5 = 95;
		System.out.println((int) character1 + " -> " + (char) character1);
		System.out.println((int) character2 + " -> " + (char) character2);
		System.out.println((int) character3 + " -> " + (char) character3);
		System.out.println((int) character4 + " -> " + (char) character4);
		System.out.println((int) character5 + " -> " + (char) character5);

		System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
		int number = 123;
		System.out.println("Число N содержит: ");
		System.out.println((number / 100) % 100 + " сотен");
		System.out.println((number / 10) % 10 + " десятков");
		System.out.println(number % 10 + " единиц");

		System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
		System.out.println("    /\\    ");
		System.out.println("   /  \\   ");
		System.out.println("  /_( )\\  ");
		System.out.println(" /      \\ ");
		System.out.println("/____/\\__\\");

		System.out.println("\n9. Произведение и сумма цифр числа");
		number = 345;
		int multiplication = ((number / 100) % 100) * ((number / 10) % 10) * (number % 10);
		int summ = ((number / 100) % 100) + ((number / 10) % 10) + (number % 10);
		System.out.println("сумма цифр числа N = " + summ);
		System.out.println("произведение цифр числа N = " + multiplication);

		System.out.println("\n10. Преобразование секунд");
		number = 86399;
		int hours = number / 3600;
		int minutes = (number % 3600) / 60;
		int seconds = (number % 3600) % 60;
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}