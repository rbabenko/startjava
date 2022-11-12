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
        for (int i = 0; i < length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[length - i - 1];
            intArr[length - i - 1] = temp;
        }
        printIntArray(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        length = 10;
        intArr = new int[length];
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int mul = 1;
        for (int num : intArr) {
            if (!(num == 0 || num == 9)) {
                mul *= num;
            }
        }
        for (int i = 1; i <= 8; i++) {
            System.out.printf(i == 8 ? "%d = %d" : "%d * ", i, mul);
        }
        for (int i = 0; i < length; i++) {
            if (intArr[i] == 0 || intArr[i] == 9) {
                System.out.printf("\nЧисло: %d, индекс: %d", intArr[i], i);
            }
        }

        System.out.println("\n3. Удаление элементов массива");
        length = 15;
        double[] doubleArray = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        double midNum = doubleArray[length / 2];
        int amountZeroNum = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > midNum) {
                doubleArray[i] = 0;
                amountZeroNum++;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.printf(i == 7 ? "%6.3f\n" : "%6.3f", doubleArray[i]);
        }
        System.out.printf("\nКоличество обнуленных ячеек: %d", amountZeroNum);

        System.out.println("\n4. Удаление элементов массива");
        length = 26;
        char[] latinArray = new char[length];
        for (int i = 65; i <= 90; i++) {
            latinArray[i - 65] = (char) i;
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.printf("%c", latinArray[j]);
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
            System.out.printf((i + 1) % 10 == 0 ? "%4d\n" : "%4d", intArr[i]);
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
}
