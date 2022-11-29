package ua.khpi.oop.saltykov04;

import java.util.Scanner;

/**
 * Завдання: 1. використовуючи програму рішення завдання лабораторної роботи №3,
 * відповідно до прикладної задачі забезпечити обробку команд користувача у
 * вигляді текстового меню.
 * 2. Забезпечити обробку параметрів командного рядка для визначення режиму
 * роботи програми.
 *
 * @author Saltykov I.
 */

public class Menu {
    static final String help = "Автор: Салтиков І.\n1.Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:\n\t-введення даних(користувач вводить дані через консоль);\n\t-перегляд даних(команда друкує в консоль поточні значення данних);\n\t-виконання обчислень(сортує рядки на дві групи);\n\t-відображення результату(друкує результат у консоль);\n\t-завершення програми.\n2.Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:\n\tпараметр \"-h\" чи \"-help\": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);\n\tпараметр \"-d\" чи \"-debug\": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.\n";
    /**
     * Точка входу консольної програми.
     *
     * @param args параметри командного рядка
     */
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("Command wasn't defined");
        else {
            switch (args[0]) {
                case "-h", "-help" -> System.out.println(help);
                case "-d", "-debug" -> debug();
                default -> {}
            }
        }
    }

    /**
     * Функція виводить на екран команди, запитує команду, котру хоче виконати
     * користувач, та виконує її.
     */
    private static void debug() {
        TwoGroupsOfLines list = new TwoGroupsOfLines();

        while (true) {
            printMenu();
            int command = getAnswer();

            if (command == 0)
                return;

            doCommand(command, list);
        }
    }

    /**
     * Друкує команди.
     */
    private static void printMenu() {
        System.out.println("\nВиберіть команду:");
        System.out.println("0 - Завершення програми");
        System.out.println("1 - Введення даних");
        System.out.println("2 - Перегляд даних");
        System.out.println("3 - Виконання обчислень");
        System.out.println("4 - Відображення результату");
    }

    /**
     * Отримує відповідь користувача в межах від 0 до 4 включно.
     * @return відповідь, котру вибрав користувач.
     */
    private static int getAnswer() {
        System.out.print("Відповідь: ");
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();

        while (answer < 0 || answer > 4) {
            System.out.println("Команда не знайдена");
            System.out.print("Відповідь: ");
            answer = scanner.nextInt();
        }
        System.out.println();

        return answer;
    }

    /**
     * Функція виконує задану команду.
     * @param command команда.
     * @param groupsOfLines список рядків.
     */
    private static void doCommand(int command, TwoGroupsOfLines groupsOfLines) {
        Scanner scanner = new Scanner(System.in);

        switch (command) {
            case 1 -> {
                System.out.print("Введіть текст: ");
                String text = scanner.nextLine();
                groupsOfLines.addLine(text);
            }
            case 2 -> System.out.println(groupsOfLines);
            case 3 -> groupsOfLines.sortLines();
            case 4 -> {
                if (groupsOfLines.size() > 0)
                    groupsOfLines.printTwoGroups();
                else
                    System.out.println("Елементи відсутні");
            }
            default -> {
            }
        }
    }
}
