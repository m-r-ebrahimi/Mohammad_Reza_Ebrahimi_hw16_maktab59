package service.impl;

import dao.CoachDao;
import entity.Coach;
import service.base.CrudService;

public class CoachService extends CrudService<Coach,Integer> {

    private static CoachService coachService;

    public static CoachService getInstance() {
        if (coachService == null) {
            synchronized (CoachService.class) {
                if (coachService == null) {
                    coachService = new CoachService();
                }
            }
        }
        return coachService;
    }

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
