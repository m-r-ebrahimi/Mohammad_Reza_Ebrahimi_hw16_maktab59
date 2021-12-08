package dao;

import dao.core.BaseDao;
import entity.Stadium;

import javax.persistence.EntityManager;

public class StadiumDao extends BaseDao<Stadium,Integer> {
    public StadiumDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Stadium> getEntityClass() {
        return Stadium.class;
    }
}
