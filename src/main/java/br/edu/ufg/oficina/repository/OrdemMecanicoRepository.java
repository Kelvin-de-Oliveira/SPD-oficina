package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.OrdemMecanico;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class OrdemMecanicoRepository {
    private static Dao<OrdemMecanico, Long> dao;

    public OrdemMecanicoRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), OrdemMecanico.class);
            TableUtils.createTableIfNotExists(database.getConnection(), OrdemMecanico.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public OrdemMecanico create(OrdemMecanico ordemMecanico) {
        try {
            dao.create(ordemMecanico);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ordemMecanico;
    }

    public List<OrdemMecanico> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}