package ua.khpi.oop.saltykov02;

import java.util.Random;

/**
 * Завдання: 8. Знайти суму всіх парних і суму всіх непарних цифр в
 * десятковому запису 8-значного цілого числа.
 *
 * @author Saltykov I.
 */

public class Main {
    /**
     * Точка входу консольної програми.
     *
     * @param args параметри командного рядка
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10000000, 99999999);

        for (int number : arr) {
            int sumOfEven = findSumOfEvenDigits(number);
            int sumOfOdd = findSumOfOddDigits(number);
            printSumOfEvenAndOddDigits(number, sumOfEven, sumOfOdd);
            System.out.println();
        }
    }

    /**
     * Функція рахує суму парних цифр 8-значного цілого числа.
     * @param number число, суму парних цифр якого потрібно знайти.
     */
    public static int findSumOfEvenDigits(int number) {
        int sumOfEven = 0;
        int mod = 10;
        int divider = 1;

        for (int i = 0; i < 8; i++) {
            int digit = number % mod / divider;

            if (digit % 2 == 0)
                sumOfEven++;

            mod *= 10;
            divider *= 10;
        }

        return sumOfEven;
    }

    /**
     * Функція рахує суму непарних цифр 8-значного цілого числа.
     * @param number число, суму непарних цифр якого потрібно знайти.
     */
    public static int findSumOfOddDigits(int number) {
        int sumOfOdd = 0;
        int mod = 10;
        int divider = 1;

        for (int i = 0; i < 8; i++) {
            int digit = number % mod / divider;

            if (digit % 2 != 0)
                sumOfOdd++;

            mod *= 10;
            divider *= 10;
        }

        return sumOfOdd;
    }

    /**
     * Функція друкує число, суми його парних та непарних цифр.
     * @param number 8-значне ціле число.
     * @param sumOfEven сума парних цифр.
     * @param sumOfOdd сума непарних цифр.
     */
    private static void printSumOfEvenAndOddDigits(int number, int sumOfEven, int sumOfOdd) {
        System.out.println("Number: " + number);
        System.out.println("Sum of even digits: " + sumOfEven);
        System.out.println("Sum of odd digits: " + sumOfOdd);
    }
}
