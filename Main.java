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

        //Nowi pracownicy z zad 3
        Worker pracownik5 = new Worker("Kamil Molenda", 5000.00, 7, "01.01.2024", "Junior");
        Worker pracownik6 = new Worker("Maciej Łapiński", 3000.00, 7, "01.02.2024", "Senior");
        Worker pracownik7 = new Worker("Izabela Komońska", 2200.00, 8, "01.03.2024", "Mid");

        Manager manager = new Manager("Janusz Zaraza", 10000.00, 5, "01.01.2020", "Menedżer");

        //Nowy manager z zad 3
        Manager manager2 = new Manager("Niemiłosz Czepialski", 20000.00, 6, "01.01.2020", "Menedżer");

        List<Employee> employees = new ArrayList<>();
        //employees.add(pracownik1);
        //employees.add(pracownik2);
        //employees.add(pracownik3);
        //employees.add(pracownik4);
        //employees.add(manager);
        employees.add(pracownik5);
        employees.add(pracownik6);
        employees.add(pracownik7);
        employees.add(manager2);

        for (Employee pracownik : employees) {
            System.out.println("- " + pracownik.getName() + " has code " + pracownik.hashCode());
            pracownik.work();
        }
        
        System.out.println("Porównanie " + pracownik6.getName() + " z innymi pracownikami:");
        System.out.println("  - Ma Id jak " + pracownik5.getName() + ": " + pracownik6.equals(pracownik5));
        System.out.println("  - Ma Id jak " + pracownik7.getName() + ": " + pracownik6.equals(pracownik7));
        System.out.println("  - Ma Id jak " + manager2.getName() + ": " + pracownik6.equals(manager2));
        
    } 
}
