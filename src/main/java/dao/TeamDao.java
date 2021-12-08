package dao;

import dao.core.BaseDao;
import entity.Team;
import entity.Player;
import entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

public class TeamDao extends BaseDao<Team, Integer> {
    public TeamDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Team> getEntityClass() {
        return Team.class;
    }

    public List<Object[]> getCitiesTeams() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Object[]> c = cb.createQuery(Object[].class);
        Root<Team> emp = c.from(Team.class);
        c.multiselect(emp.get("cityName"), cb.count(emp.get("cityName")))
                .groupBy(emp.get("cityName"));
        TypedQuery<Object[]> typed = getEntityManager().createQuery(c);
        return typed.getResultList();
    }

    public List<Object[]> getTeamsPoints() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Object[]> c = cb.createQuery(Object[].class);
        Root<Team> emp = c.from(Team.class);
        c.multiselect(emp.get("name"), emp.get("score"));

        TypedQuery<Object[]> typed = getEntityManager().createQuery(c);
        return typed.getResultList();
    }

    public Team getChampionTeam(){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Team> cq = cb.createQuery(Team.class);
        Root<Team> userRoot = cq.from(Team.class);
        Path<Long> pathToSalary = userRoot.get("score");
        Subquery<Long> subquery = cq.subquery(Long.class);
        Root<Team> subRoot = subquery.from(Team.class);
        Path<Long> subPathToSalary = subRoot.get("score");
        subquery.select(cb.max(subPathToSalary));
        cq.select(userRoot).where(cb.equal(pathToSalary, subquery));
        TypedQuery<Team> typed = getEntityManager().createQuery(cq);
        return typed.getSingleResult();
    }
}
