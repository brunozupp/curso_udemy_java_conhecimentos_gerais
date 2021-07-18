package section13.application;

import section13.entities.Department;
import section13.entities.HourContract;
import section13.entities.Worker;
import section13.enums.WorkerLevel;

import java.time.Instant;
import java.util.Date;

public class WorkerExecutar {

    public static void executar() {

        Worker worker = new Worker(
                "Bruno",
                WorkerLevel.JUNIOR,
                1200.0,
                new Department("Finanças")
        );

        HourContract contract1 = new HourContract(
                Date.from(Instant.parse("2021-07-25T00:00:00Z")),
                30.0,
                5
        );

        HourContract contract2 = new HourContract(
                Date.from(Instant.parse("2021-06-25T00:00:00Z")),
                150.0,
                2
        );

        HourContract contract3 = new HourContract(
                Date.from(Instant.parse("2021-05-25T00:00:00Z")),
                25.0,
                8
        );

        HourContract contract4 = new HourContract(
                Date.from(Instant.parse("2021-05-25T00:00:00Z")),
                50.0,
                10
        );

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);
        worker.addContract(contract4);

        HourContract contractToBeDeleted = worker.getContract(contract ->
                contract.getDate().equals(Date.from(Instant.parse("2021-07-25T00:00:00Z"))));

        if(contractToBeDeleted != null)
            worker.removeContract(contractToBeDeleted);

        System.out.println("Salário em 05/2021 = " + worker.income(5,2021));

        worker.show();

    }
}
