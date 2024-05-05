import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker pracownik1 = new Worker("Polina Rybachuk", 5000.00, 1, "01.01.2024", "Junior");
        Worker pracownik2 = new Worker("Konrad Ceprynski", 3000.00, 2, "01.02.2024", "Senior");
        Worker pracownik3 = new Worker("Kacper Molewski", 2200.00, 3, "01.03.2024", "Mid");
        Worker pracownik4 = new Worker("Kamila Schetela", 2800.00, 4, "01.04.2024", "Stażysta");

        Manager manager = new Manager("Janusz Zaraza", 10000.00, 5, "01.01.2020", "Menedżer");

        List<Employee> employees = new ArrayList<>();
        employees.add(pracownik1);
        employees.add(pracownik2);
        employees.add(pracownik3);
        employees.add(pracownik4);
        employees.add(manager);

        for (Employee pracownik : employees) {
            System.out.println("- " + pracownik.getName() + ", ID: " + pracownik.getId() + ", " +
                    "Stanowisko: " + pracownik.getPosition() + ", Data zatrudnienia: " + pracownik.getHireDate() + ", Wynagrodzenie: " + pracownik.getSalary() + " zł)");
            pracownik.work();
        } 
        
    } 
}
