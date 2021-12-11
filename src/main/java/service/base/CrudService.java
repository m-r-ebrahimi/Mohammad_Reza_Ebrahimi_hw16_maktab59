package service.base;

import dao.core.BaseDao;
import entity.core.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CrudService<T extends BaseEntity, ID extends Number> {

    public enum Type {
        BALL, COACH, PLAYER, PLAY_SOCCER, STADIUM, TEAM
    }


    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpa-maktab");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    private BaseDao<T, ID> baseDao;

    public void setBaseDao(BaseDao<T, ID> baseDao) {
        this.baseDao = baseDao;
    }

    public BaseDao<T, ID> getBaseDao() {
        return baseDao;
    }

    public void saveOrUpdate(T entity) {
        if (entity.getId() == null) {
            baseDao.save(entity);
        } else {
            baseDao.update((ID) entity.getId(), entity);
        }
    }

    public void delete(ID id) throws IllegalAccessException {
        if (id == null) {
            throw new IllegalAccessException("This entity NOT exist!");
        } else {
            baseDao.delete(id);
        }
    }

    public T loadById(ID id) throws IllegalAccessException {
        if (id == null) {
            throw new IllegalAccessException("This entity NOT exist!");
        } else {
            return baseDao.loadById(id);
        }
    }

    public List<T> loadAll() {
        return baseDao.loadAll();
    }

}

