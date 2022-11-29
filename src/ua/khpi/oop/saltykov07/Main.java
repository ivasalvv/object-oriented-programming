package ua.khpi.oop.saltykov07;

import java.util.ArrayList;
import java.util.List;

/**
 * Завдання: Використання об'єктно-орієнтованого підходу для розробки
 * об'єкта предметної (прикладної) галузі.
 * 2. Кадрове агентство
 * Дані про вакансії: посада (вид діяльності); компанія (назва комерційної
 * організації або фірми, якщо є); умови праці; оплата; вимоги до фахівця -
 * набір необов'язкових властивостей у вигляді "спеціальність, стаж, освіта".
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
        List<EmploymentAgency> library = new ArrayList<>();

        library.add(new EmploymentAgency());

        library.add(new EmploymentAgency("Тестувальник ПЗ",
                                         "ТОВ Ромашка",
                                         "Графік праці 3/3. Медичне страхування",
                                         "600$",
                                         new String[] { "Junit", "Manual testing" }));

        library.add(new EmploymentAgency("Web-дизайнер",
                                         "Водопад",
                                         "Графік праці 4/3. Додаткові курси англійської",
                                         "500$",
                                          new String[] { "Figma", "Adobe Photoshop" }));

        for (int i = 1; i <= library.size(); i++) {
            System.out.println("Вакансія №" + i);
            System.out.println(library.get(i - 1));
            System.out.println();
        }
    }
}
