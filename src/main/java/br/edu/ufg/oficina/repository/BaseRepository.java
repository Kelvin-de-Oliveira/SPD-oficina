package br.edu.ufg.oficina.repository;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;
import br.edu.ufg.oficina.domain.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseRepository<T, ID> {

    protected static Database database;
    protected Dao<T, ID> dao;
    protected List<T> loadedObjects;
    protected T loadedObject;

    public BaseRepository(Database db, Class<T> entityClass) {
        setDatabase(db, entityClass);
        loadedObjects = new ArrayList<>();
    }

    protected void setDatabase(Database db, Class<T> entityClass) {
        BaseRepository.database = db;
        try {
            dao = DaoManager.createDao(database.getConnection(), entityClass);
            TableUtils.createTableIfNotExists(database.getConnection(), entityClass);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public T create(T entity) {
        try {
            int nrows = dao.create(entity);
            if (nrows == 0)
                throw new SQLException("Error: object not saved");
            this.loadedObject = entity;
            this.loadedObjects.add(entity);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return entity;
    }

    public T findById(ID id) {
        try {
            this.loadedObject = dao.queryForId(id);
            if (this.loadedObject != null)
                this.loadedObjects.add(this.loadedObject);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedObject;
    }

    public List<T> findAll() {
        try {
            this.loadedObjects = dao.queryForAll();
            if (!this.loadedObjects.isEmpty())
                this.loadedObject = this.loadedObjects.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedObjects;
    }

    public void update(T entity) {
        try {
            dao.update(entity);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(T entity) {
        try {
            dao.delete(entity);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public T getLoadedObject() { return loadedObject; }
    public List<T> getLoadedObjects() { return loadedObjects; }
}