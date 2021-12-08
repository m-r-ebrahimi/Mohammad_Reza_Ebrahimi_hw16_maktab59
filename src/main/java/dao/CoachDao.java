package dao;

import dao.core.BaseDao;
import entity.Coach;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

public class CoachDao extends BaseDao<Coach, Integer> {
    public CoachDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Coach> getEntityClass() {
        return Coach.class;
    }

    public Coach getMostExpensive() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Coach> cq = cb.createQuery(Coach.class);
        Root<Coach> userRoot = cq.from(Coach.class);
        Path<Long> pathToSalary = userRoot.get("salary");
        Subquery<Long> subquery = cq.subquery(Long.class);
        Root<Coach> subRoot = subquery.from(Coach.class);
        Path<Long> subPathToSalary = subRoot.get("salary");
        subquery.select(cb.max(subPathToSalary));
        cq.select(userRoot).where(cb.equal(pathToSalary, subquery));
        TypedQuery<Coach> typed = getEntityManager().createQuery(cq);
        return typed.getSingleResult();
    }
}
