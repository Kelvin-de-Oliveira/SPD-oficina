package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.ItemPeca;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class ItemPecaRepository {
    private static Dao<ItemPeca, Long> dao;

    public ItemPecaRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), ItemPeca.class);
            TableUtils.createTableIfNotExists(database.getConnection(), ItemPeca.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ItemPeca create(ItemPeca item) {
        try {
            dao.create(item);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return item;
    }

    public List<ItemPeca> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(ItemPeca item) {
        try {
            dao.update(item);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(ItemPeca item) {
        try {
            dao.delete(item);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}