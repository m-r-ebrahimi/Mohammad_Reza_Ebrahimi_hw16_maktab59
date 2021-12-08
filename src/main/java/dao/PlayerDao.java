package dao;

import dao.core.BaseDao;
import entity.Coach;
import entity.Player;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PlayerDao extends BaseDao<Player, Integer> {
    public PlayerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Player> getEntityClass() {
        return Player.class;
    }

    public List<Player> getExpensivePlayers() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Player> c = cb.createQuery(Player.class);
        Root<Player> emp = c.from(Player.class);
        c.select(emp)
                .where(cb.greaterThanOrEqualTo(emp.get("salary"),1000));
        TypedQuery<Player> typed = getEntityManager().createQuery(c);
        return typed.getResultList();

    }
}
