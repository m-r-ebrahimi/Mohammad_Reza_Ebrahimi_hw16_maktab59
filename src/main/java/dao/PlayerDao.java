package dao;

import dao.core.BaseDao;
import entity.Player;

import javax.persistence.EntityManager;

public class PlayerDao extends BaseDao<Player,Integer> {
    public PlayerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Player> getEntityClass() {
        return Player.class;
    }
}
