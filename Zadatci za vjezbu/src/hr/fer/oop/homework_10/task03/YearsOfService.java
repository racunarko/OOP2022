package hr.fer.oop.homework_10.task03;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class YearsOfService implements Predicate<Employee> {

    private int years;
    private LocalDate onDate;

    public YearsOfService(int years, LocalDate onDate) {
        this.years = years;
        this.onDate = onDate;
    }


    @Override
    public boolean test(Employee employee) {
        Period period = Period.between(employee.getEmploymentDate(), onDate);
        return period.getYears() >= years && period.getYears() < years + 1;
    }
}
