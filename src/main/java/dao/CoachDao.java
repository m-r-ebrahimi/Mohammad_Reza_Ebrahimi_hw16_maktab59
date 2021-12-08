package dao;

import dao.core.BaseDao;
import entity.Coach;

import javax.persistence.EntityManager;

public class CoachDao extends BaseDao<Coach,Integer> {
    public CoachDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Coach> getEntityClass() {
        return Coach.class;
    }
}
