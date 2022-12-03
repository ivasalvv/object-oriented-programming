package ua.khpi.oop.saltykov07;

import java.util.ArrayList;
import java.util.List;

/**
 *  Клас 2. Кадрове агентство.
 */
public class EmploymentAgency {
    private final List<Vacancy> vacancies;

    public EmploymentAgency() {
        this.vacancies = new ArrayList<>();
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public boolean add(Vacancy vacancy) {
        return vacancies.add(vacancy);
    }

    public Vacancy remove(int index) {
        return vacancies.remove(index);
    }

    public int size() {
        return vacancies.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= size(); i++) {
            sb.append("Вакансія №")
                    .append(i)
                    .append("\n")
                    .append(vacancies.get(i - 1))
                    .append("\n\n");
        }

        return sb.toString();
    }
}
