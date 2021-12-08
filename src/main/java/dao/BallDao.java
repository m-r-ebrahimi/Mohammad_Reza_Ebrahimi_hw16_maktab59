package dao;

import dao.core.BaseDao;
import entity.Ball;

import javax.persistence.EntityManager;

public class BallDao extends BaseDao<Ball,Integer> {
    public BallDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Ball> getEntityClass() {
        return Ball.class;
    }
}
