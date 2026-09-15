package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Veiculo;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class VeiculoRepository {
    private static Dao<Veiculo, Long> dao;

    public VeiculoRepository(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Veiculo.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Veiculo.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Veiculo create(Veiculo veiculo) {
        try {
            dao.create(veiculo);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return veiculo;
    }

    public Veiculo findById(long id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Veiculo> findAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void update(Veiculo veiculo) {
        try {
            dao.update(veiculo);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(Veiculo veiculo) {
        try {
            dao.delete(veiculo);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}