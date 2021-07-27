package projetojdbc_dao;

import projetojdbc_dao.models.dao.DaoFactory;
import projetojdbc_dao.models.dao.SellerDao;
import projetojdbc_dao.models.entities.Department;
import projetojdbc_dao.models.entities.Seller;

import java.util.List;

public class ProjetoJdbcDaoExecutar {

    public static void executar() {

        SellerDao sellerDao = DaoFactory.createSellerDao();

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

        System.out.println("=== TESTE 3: seller findAll ===");
        List<Seller> list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
