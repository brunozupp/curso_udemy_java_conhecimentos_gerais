package section10.exerciciolistafixacao;

import java.util.ArrayList;
import java.util.List;

public class ExercicioListaFixacaoExecutar {

    public static void executar() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Bruno",500));
        employees.add(new Employee(2,"Roberto",1500));
        employees.add(new Employee(3, "Carla", 700));

        show(employees);

        increaseSalary(employees, 4, 0.5);
        increaseSalary(employees, 1, 0.5);
        increaseSalary(employees, 3, 1);

        show(employees);
    }

    public static void show(List<Employee> list) {
        list.forEach(l -> l.show());
        System.out.println("---------------------------");
    }

    public static void increaseSalary(List<Employee> employees, int id, double percentage) {
        var employee = employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if(employee == null) {
            System.out.println("Id " + id + " não existe");
            return;
        }

        employee.increaseSalary(percentage);
    }
}
