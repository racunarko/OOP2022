package hr.fer.oop.homework_10.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws IOException {
        String filenameEmployees = "Zadatci za vjezbu/src/hr/fer/oop/homework_10/task03/employees.txt";
        String filenameYears = "Zadatci za vjezbu/src/hr/fer/oop/homework_10/task03/years.dat";

        List<Employee> employees = EmployeeLoader.loadFromFile(filenameEmployees);

        // try for small files, we can use Files.readAllBytes
        try (InputStream stream = Files.newInputStream(Path.of(filenameYears))) {
            int years;
            while ((years = stream.read()) != -1) { // years can be between 0 and 255
                Predicate<Employee> predicate = new YearsOfService(years, LocalDate.now());
                System.out.printf("Employees with %d years of service.\n", years);
                for (Employee e : employees) {
                    if (predicate.test(e)) {
                        System.out.printf("\t%s\n", e);
                    }
                }
                System.out.println();
            }
        }
    }
}
