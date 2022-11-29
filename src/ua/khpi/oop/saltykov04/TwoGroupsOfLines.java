package ua.khpi.oop.saltykov04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoGroupsOfLines {
    private final List<String> list;

    public TwoGroupsOfLines() {
        list = new ArrayList<>();
    }

    public List<String> getList() {
        return list;
    }

    /**
     * Додавання елемента в список рядків.
     * @param text текст, котрий потрібно додати в список.
     * @return true, якщо рядок додано, інакше - false.
     */
    public boolean addLine(String text) {
        return list.add(text);
    }

    /**
     * Функція знаходить розмір списку.
     * @return кількість рядків.
     */
    public int size() {
        return list.size();
    }

    /**
     * Сортування рядків за розміром.
     */
    public void sortLines() {
        list.sort(Comparator.comparingInt(String::length));
    }

    /**
     * Функція визначає середній елемент, друкує дві групи рядків та їх розміри.
     */
    public void printTwoGroups() {
        int averageIndex = getAverageIndex();
        System.out.println("Group 1:");
        for (int i = 0; i < averageIndex; i++) {
            System.out.println("Size: " + list.get(i).length());
            System.out.println(list.get(i));
        }
        if (list.size() > 1) {
            System.out.println("\nGroup 2:");
            for (int i = averageIndex; i < list.size(); i++) {
                System.out.println("Size: " + list.get(i).length());
                System.out.println(list.get(i));
            }
        }
    }

    /**
     * Функція знаходе індекс середнього рядка зі списку.
     * @return індекс середнього рядка зі списку.
     */
    public int getAverageIndex() {
        int averageIndex;
        if (list.size() % 2 == 0)
            averageIndex = list.size() / 2;
        else
            averageIndex = list.size() / 2 + 1;

        return averageIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String text : list) {
            sb.append(text)
                    .append("\n");
        }
        return sb.toString();
    }
}
