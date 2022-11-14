package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 7, 5, 4, 1, 3, 2};
        System.out.printf("Исходный массив:");
        printIntArray(intArr);
        System.out.printf("\nПеревернутый массив:");
        int length = intArr.length;
        for (int i = 0; i < length; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = temp;
        }
        printIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        length = 10;
        intArr = new int[length];
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int mult = 1;
        for (int i = 1; i <= 8; i++) {
            mult *= intArr[i];
            System.out.printf(i == 8 ? "%d = %d" : "%d * ", i, mult);
        }
        System.out.printf("\nЧисло: %d, индекс: %d", intArr[0], 0);
        System.out.printf("\nЧисло: %d, индекс: %d", intArr[9], 9);

        System.out.println("\n\n3. Удаление элементов массива");
        length = 15;
        double[] doubleArray = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("Исходный массив");
        printDoubleArray(doubleArray);
        double middleNumber = doubleArray[length / 2];
        int amountZero = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > middleNumber) {
                doubleArray[i] = 0;
                amountZero++;
            }
        }
        System.out.println("\nИзмененный массив");
        printDoubleArray(doubleArray);
        System.out.printf("\nКоличество обнуленных ячеек: %d", amountZero);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        length = 26;
        char[] latinAlphabet = new char[length];
        for (int i = 65; i <= 90; i++) {
            latinAlphabet[i - 65] = (char) i;
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.printf("%c", latinAlphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        length = 30;
        intArr = new int[length];
        for (int i = 0; i < length; i++) {
            int generatedNum;
            do {
                generatedNum = generateNumber();
            } while (contains(generatedNum, intArr));
            intArr[i] = generatedNum;
        }
        Arrays.sort(intArr);
        for (int i = 0; i < 30; i++) {
            System.out.printf("%4d" + ((i + 1) % 10 == 0 ? "\n" : ""), intArr[i]);
        }
    }

    private static void printIntArray(int... numbers) {
        for (int num : numbers) {
            System.out.printf("%2d", num);
        }
    }

    private static boolean contains(int num, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }

    private static int generateNumber() {
        return (int) (60 + Math.random() * 40);
    }

    private static void printDoubleArray(double... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%6.3f" + (i == 7 ? "\n" : ""), numbers[i]);
        }
    }
}
