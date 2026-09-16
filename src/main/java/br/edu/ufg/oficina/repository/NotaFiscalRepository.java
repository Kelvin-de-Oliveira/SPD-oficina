package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.NotaFiscal;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class NotaFiscalRepository {
    private static Dao<NotaFiscal, Long> dao;

    public NotaFiscalRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), NotaFiscal.class);
            TableUtils.createTableIfNotExists(database.getConnection(), NotaFiscal.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public NotaFiscal create(NotaFiscal nota) {
        try {
            dao.create(nota);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return nota;
    }

    public NotaFiscal findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<NotaFiscal> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(NotaFiscal nota) {
        try {
            dao.update(nota);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(NotaFiscal nota) {
        try {
            dao.delete(nota);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}