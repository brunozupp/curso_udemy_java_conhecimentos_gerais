package projetojdbc_dao;

import projetojdbc_dao.models.entities.Department;
import projetojdbc_dao.models.entities.Seller;

import java.util.Date;

public class ProjetoJdbcDaoExecutar {

    public static void executar() {

        Department department = new Department(1,"Books");

        Seller seller = new Seller(21,"Bob", "bob@gmail.com", new Date(), 3000.0, department);

        System.out.println(seller);
    }
}
