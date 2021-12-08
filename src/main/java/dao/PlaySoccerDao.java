package dao;

import dao.core.BaseDao;
import entity.PlaySoccer;

import javax.persistence.EntityManager;

public class PlaySoccerDao extends BaseDao<PlaySoccer,Integer> {
        public PlaySoccerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<PlaySoccer> getEntityClass() {
        return PlaySoccer.class;
    }
}
