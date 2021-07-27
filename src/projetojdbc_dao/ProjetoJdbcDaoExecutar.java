package projetojdbc_dao;

import projetojdbc_dao.models.dao.DaoFactory;
import projetojdbc_dao.models.dao.DepartmentDao;
import projetojdbc_dao.models.dao.SellerDao;
import projetojdbc_dao.models.entities.Department;
import projetojdbc_dao.models.entities.Seller;

import java.util.Date;
import java.util.List;

public class ProjetoJdbcDaoExecutar {

    public static void executar() {

        executarDepartment();
    }

    private static void executarDepartment() {

//        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== TESTE 1: department findById ===");
//        Department department = departmentDao.findById(1);
//        System.out.println(department);

//        System.out.println("=== TESTE 2: department findAll ===");
//        List<Department> departments = departmentDao.findAll();
//        departments.forEach(department -> System.out.println(department));

//        System.out.println("=== TESTE 3: department insert ===");
//        Department department = new Department(null, "Teste");
//        departmentDao.insert(department);
//        System.out.println("Id do departamento = " + department.getId());

//        System.out.println("=== TESTE 4: department update ===");
//        Department department = departmentDao.findById(5);
//        department.setName("Teste que foi editado");
//        departmentDao.update(department);
//        System.out.println("Update completed");

//        System.out.println("=== TESTE 5: department delete ===");
//        departmentDao.deleteById(5);
//        System.out.println("Delete completed");
    }

    private static void executarSeller() {

//        SellerDao sellerDao = DaoFactory.createSellerDao();

//        System.out.println("=== TESTE 1: seller findById ===");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);

//        System.out.println("=== TESTE 2: seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }

//        System.out.println("=== TESTE 3: seller findAll ===");
//        List<Seller> list = sellerDao.findAll();
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }

//        System.out.println("=== TESTE 4: seller insert ===");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println("New seller id = " + newSeller.getId());

//        System.out.println("=== TESTE 5: seller update ===");
//        Seller seller = sellerDao.findById(1);
//        seller.setName("Marta editada");
//        sellerDao.update(seller);
//        System.out.println("Update completed");

//        System.out.println("=== TESTE 6: seller delete ===");
//        sellerDao.deleteById(7);
//        System.out.println("Delete completed");

    }
}
