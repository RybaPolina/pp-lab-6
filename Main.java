import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Polina Rybachuk", 5000.00, 1);
        Worker worker2 = new Worker("Konrad Ceprynski", 3000.00, 2);
        Worker worker3 = new Worker("Kacper Molewski", 2200.00, 3);
        Worker worker4 = new Worker("Kamila Schetela", 2800.00, 4);

        Manager manager = new Manager("Janusz Zaraza", 10000.00, 5);

        System.out.println("Pracownicy:");
        for (Worker worker : new Worker[]{worker1, worker2, worker3, worker4}) {
            System.out.println("   - " + worker.getName() + ": " + worker.getSalary() + " zł");
            worker.work();
        }

        System.out.println("Menedżer:");
        System.out.println("   - " + manager.getName() + ": " + manager.getSalary() + " zł");
        manager.work();
    }
}
