package section13.entities;

import section13.enums.WorkerLevel;
import section13.interfaces.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Worker implements BaseEntity {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public HourContract getContract(Predicate<HourContract> predicate) {
        return this.contracts.stream().filter(predicate).findFirst().orElse(null);
    }

    public Double income(Integer month, Integer year) {

        List<HourContract> contracts = this.contracts.stream().filter(contract -> contract.verifyMonthAndYear(month, year)).collect(Collectors.toList());

        var salary = this.baseSalary;

        for(HourContract contract : contracts) {
            salary += contract.totalValue();
        }

        return salary;
    }

    @Override
    public void show() {
        System.out.printf("Nome = %s%nLevel = %s%nSalário base = R$ %.2f%n",
                name,
                level,
                baseSalary
        );

        department.show();

        for (int i = 0; i < this.contracts.size(); i++) {
            System.out.println("Contrato " + i);
            this.contracts.get(i).show();
        }
    }
}
