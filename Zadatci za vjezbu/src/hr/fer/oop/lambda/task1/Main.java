package hr.fer.oop.lambda.task1;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "Zadatci za vjezbu/src/hr/fer/oop/lambda/task1/employees.txt";

        List<Employee> employees = EmployeeLoader.loadFromFile(filename);
        BiConsumer<Employee, Employee> action = (first, second) -> System.out.printf("%s %s\n", first, second);

        Predicate<Employee> junior = new JuniorEmployee(LocalDate.now());
        BiPredicate<Employee, Employee> predicate = (a, b) -> {
            double ratio = a.getSalary() / b.getSalary();
            return ratio < 0.8 || ratio > 1.2;
        };
        predicate = predicate.and((a, b) -> junior.test(a) && junior.test(b));

        processPairs(employees, action, predicate);

    }

    private static void processPairs(List<Employee> employees, BiConsumer<Employee, Employee> action, BiPredicate<Employee, Employee> predicate) {
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                Employee first = employees.get(i);
                Employee second = employees.get(j);
                if (predicate.test(first, second)) {
                    action.accept(first, second);
                }
            }
        }
    }
}
