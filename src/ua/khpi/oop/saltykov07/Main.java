package ua.khpi.oop.saltykov07;

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
        EmploymentAgency agency = new EmploymentAgency();

        agency.add(new Vacancy());

        agency.add(new Vacancy("Тестувальник ПЗ",
                                         "ТОВ Ромашка",
                                         "Графік праці 3/3. Медичне страхування",
                                         "600$",
                                         new String[] { "Junit", "Manual testing" }));

        agency.add(new Vacancy("Web-дизайнер",
                                         "Водопад",
                                         "Графік праці 4/3. Додаткові курси англійської",
                                         "500$",
                                          new String[] { "Figma", "Adobe Photoshop" }));

        System.out.println("Adding 3 vacancies...");
        System.out.println(agency);

        System.out.println("Removing second vacancy...");
        agency.remove(1);
        System.out.println(agency);
    }
}
