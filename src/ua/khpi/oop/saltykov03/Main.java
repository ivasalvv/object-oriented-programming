package ua.khpi.oop.saltykov03;

import java.util.ArrayList;
import java.util.List;

/**
 * Завдання: 3. Ввести декілька рядків. Розбити на дві групи: рядки,
 * довжина яких менша за середню; рядки, довжина яких не менше середньої.
 * Вивести рядки та їх довжину по групах.
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
        List<String> list = new ArrayList<>();

        // input data
        list.add("Hello");
        list.add("How are you?");
        list.add("I'm fine");
        list.add("Nice to meet you");
        list.add("Okay");

        printTwoGroups(list);
    }

    /**
     * Функція обчислює середню довжину.
     * @param list список рядків.
     * @return середню довжину.
     */
    public static int getAverageLength(List<String> list) {
        int averageLength = 0;

        for (String s : list)
            averageLength += s.length();

        averageLength /= list.size();

        return averageLength;
    }

    /**
     * Функція друкує дві групи: рядки, довжина яких менша за середню;
     * рядки, довжина яких не менше середньої. Виводить рядки та їх довжину.
     * @param list список рядків.
     */
    public static void printTwoGroups(List<String> list) {
        int averageLength = getAverageLength(list);

        System.out.println("Group 1:");
        for (String s : list) {
            if (s.length() < averageLength) {
                System.out.println(s);
                System.out.println("Size: " + s.length());
            }
        }

        System.out.println("\nGroup 2:");
        for (String s : list) {
            if (s.length() >= averageLength) {
                System.out.println(s);
                System.out.println("Size: " + s.length());
            }
        }
    }
}
