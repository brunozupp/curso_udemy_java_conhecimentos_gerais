package projetojdbc_dao.models.dao.impl;

import projetojdbc_dao.db.DB;
import projetojdbc_dao.db.DbException;
import projetojdbc_dao.models.dao.DepartmentDao;
import projetojdbc_dao.models.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department object) {

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = conn.prepareStatement("INSERT INTO department(Name) VALUES(?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,object.getName());

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                if(resultSet.next()) {
                    int id = resultSet.getInt(1);
                    object.setId(id);
                }

                DB.closeResultSet(resultSet);

            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void update(Department object) {

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = conn.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?",
                    PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,object.getName());
            preparedStatement.setInt(2,object.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void deleteById(Integer id) {

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement("DELETE FROM department WHERE Id = ?");

            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public Department findById(Integer id) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM department WHERE Id = ?");

            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("Id"));
                department.setName(resultSet.getString("Name"));
                return department;
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }

        return null;
    }

    @Override
    public List<Department> findAll() {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM department");

            resultSet = preparedStatement.executeQuery();

            List<Department> departments = new ArrayList<>();

            while(resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("Id"));
                department.setName(resultSet.getString("Name"));
                departments.add(department);
            }

            return departments;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }
}
