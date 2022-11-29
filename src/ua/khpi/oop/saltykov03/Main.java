package ua.khpi.oop.saltykov03;

import java.util.ArrayList;
import java.util.Comparator;
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


        list.sort(Comparator.comparingInt(String::length));
        int averageIndex = getAverageIndex(list);
        printTwoGroups(list, averageIndex);
    }

    /**
     * Функція знаходе індекс середнього рядка зі списку.
     * @param list список всіх рядків.
     * @return індекс середнього рядка зі списку.
     */
    public static int getAverageIndex(List<String> list) {
        int averageIndex;
        if (list.size() % 2 == 0)
            averageIndex = list.size() / 2;
        else
            averageIndex = list.size() / 2 + 1;

        return averageIndex;
    }

    /**
     * Функція друкує дві групи рядків та їх розміри.
     * @param list список всіх рядків.
     * @param averageIndex індекс середнього елемента.
     */
    public static void printTwoGroups(List<String> list, int averageIndex) {
        System.out.println("Group 1:");
        for (int i = 0; i < averageIndex; i++) {
            System.out.println("Size: " + list.get(i).length());
            System.out.println(list.get(i));
        }
        System.out.println("\nGroup 2:");
        for (int i = averageIndex; i < list.size(); i++) {
            System.out.println("Size: " + list.get(i).length());
            System.out.println(list.get(i));
        }
    }
}
