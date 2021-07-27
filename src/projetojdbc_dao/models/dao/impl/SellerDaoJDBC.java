package projetojdbc_dao.models.dao.impl;

import projetojdbc_dao.db.DB;
import projetojdbc_dao.db.DbException;
import projetojdbc_dao.models.dao.SellerDao;
import projetojdbc_dao.models.entities.Department;
import projetojdbc_dao.models.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller object) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("INSERT INTO seller(Name,Email,BirthDate,BaseSalary,DepartmentId) " +
                    "VALUES(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1,object.getName());
            st.setString(2,object.getEmail());
            st.setDate(3,new java.sql.Date(object.getBirthDate().getTime()));
            st.setDouble(4,object.getBaseSalary());
            st.setInt(5,object.getDepartment().getId());

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) {
                    int id = rs.getInt(1);

                    // Por ser valor por referência, meu objeto vai ficar com o id quando for usar depois
                    // dessa execução
                    object.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Seller object) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT seller.*, department.Name as DepName " +
                    "FROM seller INNER JOIN department ON seller.DepartmentId = department.Id " +
                    "WHERE seller.Id = ?");

            st.setInt(1, id);

            rs = st.executeQuery();

            // Se minha pesquisa deu nenhum resultado, não vai ter próxima linha
            // Ele começa na linha 0, que não tem nada
            if(rs.next()) {
                Department department = instantiateDepartment(rs);
                Seller seller = instantiateSeller(rs,department);
                return seller;
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

        return null;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department department = new Department();
        department.setId(rs.getInt("DepartmentId"));
        department.setName(rs.getString("DepName"));
        return department;
    }

    private Seller instantiateSeller(ResultSet rs, Department department) throws SQLException {
        Seller seller = new Seller();
        seller.setId(rs.getInt("Id"));
        seller.setName(rs.getString("Name"));
        seller.setEmail(rs.getString("Email"));
        seller.setBaseSalary(rs.getDouble("BaseSalary"));
        seller.setBirthDate(rs.getDate("BirthDate"));
        seller.setDepartment(department);
        return seller;
    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT seller.*, department.Name as DepName " +
                    "FROM seller INNER JOIN department ON seller.DepartmentId = department.Id " +
                    "ORDER BY Name");

            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();

            // Usando o map para reaproveitar a mesma instância de departamento
            Map<Integer, Department> map = new HashMap<>();

            // Se minha pesquisa deu nenhum resultado, não vai ter próxima linha
            // Ele começa na linha 0, que não tem nada
            while(rs.next()) {

                Department dep = map.get(rs.getInt("DepartmentId"));

                if(dep == null) {
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }

                Seller seller = instantiateSeller(rs,dep);
                list.add(seller);
            }

            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT seller.*, department.Name as DepName " +
                    "FROM seller INNER JOIN department ON seller.DepartmentId = department.Id " +
                    "WHERE DepartmentId = ? ORDER BY Name");

            st.setInt(1, department.getId());

            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();

            // Usando o map para reaproveitar a mesma instância de departamento
            Map<Integer, Department> map = new HashMap<>();

            // Se minha pesquisa deu nenhum resultado, não vai ter próxima linha
            // Ele começa na linha 0, que não tem nada
            while(rs.next()) {

                Department dep = map.get(rs.getInt("DepartmentId"));

                if(dep == null) {
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }

                Seller seller = instantiateSeller(rs,dep);
                list.add(seller);
            }

            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
