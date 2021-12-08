package dao;

import dao.core.BaseDao;
import entity.Team;

import javax.persistence.EntityManager;

public class TeamDao extends BaseDao<Team,Integer> {
    public TeamDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Team> getEntityClass() {
        return Team.class;
    }
}
