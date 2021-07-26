package section20.exerciciostreamfixacao;

public class Employee {

    private String name;
    private String email;
    private Double salary;

    public Employee(String lineFromCSV) {
        String[] fields = lineFromCSV.split(",");

        this.name = fields[0];
        this.email = fields[1];
        this.salary = Double.parseDouble(fields[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
