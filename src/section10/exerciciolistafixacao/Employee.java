package section10.exerciciolistafixacao;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void increaseSalary(double percentage) {
        this.salary += (this.salary * percentage);
    }

    public void show() {
        System.out.printf("%d - %s - R$ %.2f%n", id,name,salary);
    }
}
