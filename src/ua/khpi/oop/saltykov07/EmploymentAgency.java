package ua.khpi.oop.saltykov07;

import java.util.StringJoiner;

/**
 *  Клас 2. Кадрове агентство.
 *  Дані про вакансії:
 *   - посада (вид діяльності);
 *   - компанія (назва комерційної організації або фірми, якщо є);
 *   - умови праці;
 *   - оплата;
 *   - вимоги до фахівця - набір необов'язкових властивостей у вигляді "спеціальність, стаж, освіта".
 */
public class EmploymentAgency {
    private final String position;
    private final String companyName;
    private final String workingConditions;
    private final String payment;
    private final String[] requirements;

    public EmploymentAgency(){
        this.position = "Розробник ПЗ";
        this.companyName = "Рога та копита";
        this.workingConditions = "Графік праці 5/2. 21 день оплачуваної відпустки.";
        this.payment = "900$";
        this.requirements = new String[] { "Java", "Junit", "Git" };
    }

    public EmploymentAgency(String position, String companyName, String workingConditions, String payment, String[] requirements) {
        this.position = position;
        this.companyName = companyName;
        this.workingConditions = workingConditions;
        this.payment = payment;
        this.requirements = requirements;
    }

    public String getPosition() {
        return position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getWorkingConditions() {
        return workingConditions;
    }

    public String getPayment() {
        return payment;
    }

    public String[] getRequirements() {
        return requirements;
    }


    public String toString() {
        return  "Посада: " + position +
                "\nНазва компанії: " + companyName +
                "\nУмови праці: " + workingConditions +
                "\nОплата: " + payment +
                "\nВимоги: " + getStringRequirements();
    }

    /**
     * Функція перетворює масив в рядок, у якому перераховує
     * елементи через кому.
     * @return перетворенний рядок.
     */
    private String getStringRequirements() {
        StringJoiner sj = new StringJoiner(", ");
        for (String requirement : requirements)
            sj.add(requirement);

        return sj.toString();
    }
}
