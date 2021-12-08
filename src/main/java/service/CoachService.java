package service;

import dao.CoachDao;
import entity.Coach;
import service.base.CrudService;

public class CoachService extends CrudService<Coach,Integer> {
    public CoachService() {
        setBaseDao(new CoachDao(getEntityManager()));
    }

    public CoachDao getBaseDao() {
        return (CoachDao) super.getBaseDao();
    }

    public Coach getExpensiveCoach(){
        return new CoachDao(getEntityManager()).getMostExpensive();
    }
}
