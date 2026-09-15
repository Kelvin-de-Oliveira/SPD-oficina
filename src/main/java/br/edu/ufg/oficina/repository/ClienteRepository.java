package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Cliente;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class ClienteRepository {
    private static Dao<Cliente, Long> dao;

    public ClienteRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Cliente.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Cliente.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Cliente create(Cliente cliente) {
        try {
            dao.create(cliente);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cliente;
    }

    public Cliente findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Cliente> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(Cliente cliente) {
        try {
            dao.update(cliente);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(Cliente cliente) {
        try {
            dao.delete(cliente);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}