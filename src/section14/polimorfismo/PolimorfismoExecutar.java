package section14.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class PolimorfismoExecutar {

    public static void executar() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Bruno", 10, 25.0));
        employees.add(new OutsourcedEmployee("Roberto", 10, 30.0, 5.0));

        for(Employee employee : employees) {
            System.out.printf("%s - R$ %.2f%n", employee.name, employee.payment());
        }
    }


}
