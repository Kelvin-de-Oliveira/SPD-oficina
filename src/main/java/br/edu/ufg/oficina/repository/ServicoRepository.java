package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Servico;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class ServicoRepository {
    private static Dao<Servico, Long> dao;

    public ServicoRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Servico.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Servico.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Servico create(Servico servico) {
        try {
            dao.create(servico);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return servico;
    }

    public Servico findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(Servico servico) {
        try {
            dao.update(servico);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Servico> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void delete(Servico servico) {
        try {
            dao.delete(servico);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}