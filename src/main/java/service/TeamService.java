package service;

import dao.TeamDao;
import entity.Team;
import service.base.CrudService;

public class TeamService extends CrudService<Team,Integer> {
    public TeamService() {
        setBaseDao(new TeamDao(getEntityManager()));
    }

    public TeamDao getBaseDao() {
        return (TeamDao) super.getBaseDao();
    }
}
