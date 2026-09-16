package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Peca;
import br.edu.ufg.oficina.domain.Servico;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class PecaRepository {
    private static Dao<Peca, Long> dao;

    public PecaRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Peca.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Peca.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Peca create(Peca peca) {
        try {
            dao.create(peca);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return peca;
    }

    public Peca findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(Peca peca) {
        try {
            dao.update(peca);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Peca> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void delete(Peca peca) {
        try {
            dao.delete(peca);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}