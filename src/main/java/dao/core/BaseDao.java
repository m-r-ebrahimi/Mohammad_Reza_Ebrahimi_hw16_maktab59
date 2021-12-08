package dao.core;

import entity.core.BaseEntity;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseDao<T extends BaseEntity, ID extends Number> implements BaseDaoInterface<T, ID> {
    private EntityManager entityManager;

    public BaseDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(ID id, T newEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(newEntity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(ID id) {
        entityManager.getTransaction().begin();
        T entity = loadById(id);
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public T loadById(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<T> loadAll() {
        return entityManager.createQuery("From " +
                getEntityClass().getSimpleName()).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public abstract Class<T> getEntityClass();
}

