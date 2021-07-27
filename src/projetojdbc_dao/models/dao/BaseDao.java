package projetojdbc_dao.models.dao;

import java.util.List;

public interface BaseDao<T> {

    void insert(T object);

    void update(T object);

    void deleteById(Integer id);

    T findById(Integer id);

    List<T> findAll();
}
