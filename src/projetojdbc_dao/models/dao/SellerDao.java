package projetojdbc_dao.models.dao;

import projetojdbc_dao.models.entities.Department;
import projetojdbc_dao.models.entities.Seller;

import java.util.List;

public interface SellerDao extends BaseDao<Seller> {

    List<Seller> findByDepartment(Department department);
}
