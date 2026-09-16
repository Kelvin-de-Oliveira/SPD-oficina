package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.OrdemServico;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class OrdemServicoRepository {
    private static Dao<OrdemServico, Long> dao;

    public OrdemServicoRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), OrdemServico.class);
            TableUtils.createTableIfNotExists(database.getConnection(), OrdemServico.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public OrdemServico create(OrdemServico ordem) {
        try {
            dao.create(ordem);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ordem;
    }

    public OrdemServico findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<OrdemServico> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(OrdemServico ordem) {
        try {
            dao.update(ordem);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(OrdemServico ordem) {
        try {
            dao.delete(ordem);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


}