package projetojdbc_dao;

import projetojdbc_dao.models.dao.DaoFactory;
import projetojdbc_dao.models.dao.SellerDao;
import projetojdbc_dao.models.entities.Seller;

public class ProjetoJdbcDaoExecutar {

    public static void executar() {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
