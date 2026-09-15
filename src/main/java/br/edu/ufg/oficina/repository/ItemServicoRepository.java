package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.ItemServico;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class ItemServicoRepository {
    private static Dao<ItemServico, Long> dao;

    public ItemServicoRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), ItemServico.class);
            TableUtils.createTableIfNotExists(database.getConnection(), ItemServico.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ItemServico create(ItemServico item) {
        try {
            dao.create(item);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return item;
    }

    public List<ItemServico> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}