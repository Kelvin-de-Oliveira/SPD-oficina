package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Mecanico;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class MecanicoRepository {
    private static Dao<Mecanico, Long> dao;

    public MecanicoRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Mecanico.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Mecanico.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Mecanico create(Mecanico mecanico) {
        try {
            dao.create(mecanico);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return mecanico;
    }

    public Mecanico findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(Mecanico mecanico) {
        try {
            dao.update(mecanico);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Mecanico> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void delete(Mecanico mecanico) {
        try {
            dao.delete(mecanico);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}