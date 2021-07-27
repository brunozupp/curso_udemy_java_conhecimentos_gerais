package projetojdbc_dao.models.dao;

import projetojdbc_dao.db.DB;
import projetojdbc_dao.models.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
